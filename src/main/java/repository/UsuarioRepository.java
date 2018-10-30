package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lookdofogao.receitas.model.Usuario;




	@Repository
	public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
