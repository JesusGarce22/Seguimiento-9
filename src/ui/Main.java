package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exception.GoOutException;
import exception.IdentificationException;
import model.InfoPerson;
import model.Person;

public class Main {

	public static Scanner sn = new Scanner(System.in);
	private static InfoPerson info= new InfoPerson();

	public static void main(String[] args)  {

		int option=0;
		boolean cycle=true;
		int contador=0;

		for(int i=0; i<5 && cycle;i++) {

			System.out.println("Por favor elija una opcion"+"\n");
			System.out.println("1) Registrar una persona");
			System.out.println("2) Consultar numero de personas ");
			System.out.println("3) Salir del programa");
			option = sn.nextInt();
			sn.nextLine();
			
			if(option>3) {
				cycle = false;
				System.out.println("El numero ingresado no se encuentra entre las opciones, por favor intente de nuevo");
			}
			switch(option) {

			case 1:
				System.out.println("Ingrese su tipo de documento de la siguiente forma. TI -Tarjeta de Identidad-, CC - Cédula de Ciudadanía-, PP -Pasaporte- o CE -Cédula de Extranjería");
				String tipoDocumento= sn.nextLine();

				System.out.println("Ingrese su numero de documento");
				String documento= sn.nextLine();
				
				try {
					info.addPersonToList(tipoDocumento, documento);
				} catch (IdentificationException | GoOutException e) {
					e.printStackTrace();
				}
				
				contador++;
				break;

			case 2:
				System.out.println("la cantidad total de personas que intentaron ingresar es "+contador);
				break;

			case 3: i=888888;
			System.out.println("Has salido del programa"+"\n");
			break;
			}

		}
	}



}
