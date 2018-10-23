package lookdofogao.receitas.model;

import javax.persistence.*;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String sobreMesa;
    @Column
	private String Massa;
    @Column
	private String bebida;
    @Column
	private String comidaRegional;
    @Column
	private String comidaTipica;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSobreMesa() {
		return sobreMesa;
	}
	public void setSobreMesa(String sobreMesa) {
		this.sobreMesa = sobreMesa;
	}
	public String getMassas() {
		return Massa;
	}
	public void setMassas(String massas) {
		Massa = massas;
	}
	public String getBebidas() {
		return bebida;
	}
	public void setBebidas(String bebidas) {
		this.bebida = bebidas;
	}
	public String getComidasRegionais() {
		return comidaRegional;
	}
	public void setComidasRegionais(String comidasRegionais) {
		this.comidaRegional = comidasRegionais;
	}
	public String getComidasTipicas() {
		return comidaTipica;
	}
	public void setComidasTipicas(String comidasTipicas) {
		this.comidaTipica = comidasTipicas;
	}
	
    

}
