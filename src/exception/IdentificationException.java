package exception;

public class IdentificationException extends Exception {

	public IdentificationException() {
		super("Usted no se puede ingresar porque su tipo de documento de Identidad es TI(Tarjeta de identidad)");
	}
}
