package exception;

public class GoOutException extends Exception{

	public GoOutException() {
		super("Usted no puede ingresar porque hoy no es su dia para salir.");
	}
}
