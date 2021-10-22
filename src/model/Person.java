package model;

public class Person {

	private String tipoDeDocumento;
	private String NumeroDocumento;
	
	public Person(String tipoDeDocumento, String numeroDocumento) {
		
		this.tipoDeDocumento = tipoDeDocumento;
		NumeroDocumento = numeroDocumento;
	}
	public String getTipoDeDocumento() {
		return tipoDeDocumento;
	}
	public void setTipoDeDocumento(String tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}
	public String getNumeroDocumento() {
		return NumeroDocumento;
	}

	
	
}
