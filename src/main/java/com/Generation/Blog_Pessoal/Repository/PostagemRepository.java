package com.Generation.Blog_Pessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Generation.Blog_Pessoal.Model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	// criando metodo para Querys
public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	

}
