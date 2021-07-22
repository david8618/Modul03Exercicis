package david.itacademy.Nivell01.Fase01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*
	    Fase 1
	    Crea sis variables tipu string buides.
	    Demana per consola que s’introdueixin els noms.
	    Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat.
	    Mostra per consola el nom de les 6 ciutats.
	     */
        //Variables ciutats
        String c1="",c2="",c3="",c4="",c5="",c6="";

        //Demanen al usuari els noms de les ciutats per consola. Per recollir aquestas dades fem us de la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nom de la primera ciutat:");
        c1=sc.nextLine();
        System.out.println("Ingresa el nom de la segona ciutat:");
        c2=sc.nextLine();
        System.out.println("Ingresa el nom de la tercera ciutat:");
        c3=sc.nextLine();
        System.out.println("Ingresa el nom de la quarta ciutat:");
        c4=sc.nextLine();
        System.out.println("Ingresa el nom de la cinquena ciutat:");
        c5=sc.nextLine();
        System.out.println("Ingresa el nom de la sisena ciutat:");
        c6=sc.nextLine();
        //Tanquem la clase scanner per no tenir conflictes
        sc.close();
        //Mostrem per pantalla el nom de les ciutats:
        System.out.println("El nom de les ciutats ingresades son:\n"+c1+", " + c2 + ", " + c3 + ", " + c4 + ", " + c5 + ", " + c6 + ".");
    }
}
