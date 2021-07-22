package david.itacademy.Nivell01.Fase02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*- Fase 2
    Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats).
    Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic.
     */
    public static void main(String[] args) {
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
        //Guardem les dades a un arrayCiutats
        //ArrayCiutats
        String [] arrayCiutats = {c1,c2,c3,c4,c5,c6};

        //Ordem l'array per ordre alfabetic
        Arrays.sort(arrayCiutats);
        //Mostrem l'array de les citutats
        System.out.println("Ciutats ordenades Alfabèticament");
        for (String ciutats: arrayCiutats) { System.out.println(ciutats); }
    }
}
