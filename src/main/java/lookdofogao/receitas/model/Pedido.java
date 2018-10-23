package lookdofogao.receitas.model;

import javax.persistence.*;

@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String tipoCategoria;
	
	private String nomePrato;
	
	private int quantidade;
	
	private int numeroMesa;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoCategoria() {
		return tipoCategoria;
	}
	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	

}
