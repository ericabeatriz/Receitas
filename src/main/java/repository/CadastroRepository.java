package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lookdofogao.receitas.model.Cadastro;



@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{
	
}