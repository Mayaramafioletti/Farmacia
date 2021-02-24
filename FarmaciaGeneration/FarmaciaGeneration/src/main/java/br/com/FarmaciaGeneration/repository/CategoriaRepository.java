package br.com.FarmaciaGeneration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.FarmaciaGeneration.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
	public List<Categoria> findAllByClassificacaoContainingIgnoreCase(String classificacao);
}
