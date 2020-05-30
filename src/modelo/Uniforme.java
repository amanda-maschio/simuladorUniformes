package modelo;

public class Uniforme{
	
	private Integer codigoUniforme;
	private String tipo; // Esportivo | Escolar | Empresa
	private String isGoleiro;
	private Integer temMeia;
	private Camisa camisa;
	private Calca calca;
	private Meia meia;

	public Integer getTemMeia() {
		return temMeia;
	}
	public void setTemMeia(Integer temMeia) {
		this.temMeia = temMeia;
	}
	public String getIsGoleiro() {
		return isGoleiro;
	}
	public void setIsGoleiro(String isGoleiro) {
		this.isGoleiro = isGoleiro;
	}
	public Integer getCodigoUniforme() {
		return codigoUniforme;
	}
	public void setCodigoUniforme(Integer codigoUniforme) {
		this.codigoUniforme = codigoUniforme;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Camisa getCamisa() {
		return camisa;
	}
	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	public Calca getCalca() {
		return calca;
	}
	public void setCalca(Calca calca) {
		this.calca = calca;
	}
	public Meia getMeia() {
		return meia;
	}
	public void setMeia(Meia meia) {
		this.meia = meia;
	}

	
}
