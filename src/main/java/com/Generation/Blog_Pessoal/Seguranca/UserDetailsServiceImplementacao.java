package com.Generation.Blog_Pessoal.Seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Generation.Blog_Pessoal.Model.Usuario;
import com.Generation.Blog_Pessoal.Repository.UsuarioRepository;

@Service
public abstract class UserDetailsServiceImplementacao implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	//@Override -> problema na anotação no video tem porem pede para reover se não dá erro
	public  UserDetails loadUserByUserName (String userName) throws UsernameNotFoundException{
		
		Optional<Usuario> user = userRepository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found"));
		
		return  user.map(UserDetailsImplementacao:: new).get();
	}

	
	}


