package lookdofogao.receitas.model;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Cadastro {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private int cpf;
	@Column
	private LocalDate dataNasimento;
	
	private String nomeUsuario;
	
	private String senha;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNasimento() {
		return dataNasimento;
	}
	public void setDataNasimento(LocalDate dataNasimento) {
		this.dataNasimento = dataNasimento;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
	
	