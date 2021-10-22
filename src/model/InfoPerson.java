package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import exception.GoOutException;
import exception.IdentificationException;

public class InfoPerson {

	private ArrayList<Person> list;

	public InfoPerson() {
		list = new ArrayList<>();
	}

	public ArrayList<Person> getList(){
		return list;
	}

	public void addPersonToList(String tipo,String doc) throws IdentificationException, GoOutException{

		if(tipo.equalsIgnoreCase("TI")) {
			throw new IdentificationException();
		}else {
			boolean salir=valideOut(doc);

			if(salir==false) {
				throw new GoOutException();
			}else {
				Person n= new Person(tipo,doc);
				list.add(n);
			}
		}

	}

	public boolean valideOut(String doc) {
		Date date2 = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd");
		String fecha = format.format(date2);
		int numFecha = Integer.parseInt(fecha);

		int numPenultimo = doc.length() - 2;

		if(numFecha%2 == 0 && numPenultimo%2 != 0 || numFecha%2 != 0 && numPenultimo%2 == 0  ) {
			return true;
		}
		else {
			return false;
		}


	}

}
