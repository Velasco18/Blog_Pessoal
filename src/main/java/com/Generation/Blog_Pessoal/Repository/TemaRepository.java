package com.Generation.Blog_Pessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Generation.Blog_Pessoal.Model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	// criando metodo para Querys
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
