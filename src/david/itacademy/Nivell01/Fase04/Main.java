package david.itacademy.Nivell01.Fase04;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    /*- Fase 4
    Creeu un nou array de caràcters (char array[])per cada una de les ciutats que tenim.
    La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).
    Ompliu els nous arrays lletra per lletra.
    Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).
     */

    public static void main(String[] args) {
        //Variables ciutats
        String c1 , c2 , c3 , c4 , c5, c6;

        //Demanen al usuari els noms de les ciutats per consola. Per recollir aquestas dades fem us de la clase Scanner
        Scanner sc = new Scanner(in);
        out.println("Ingresa el nom de la primera ciutat:");
        c1 = sc.nextLine();
        //Transformo el String a array de char
        char[] city1= new char[c1.length()];
        city1= c1.toCharArray();
        out.println("Ingresa el nom de la segona ciutat:");
        c2 = sc.nextLine();
        //Transformo el String a array de char
        char[] city2= new char[c2.length()];
        city2= c2.toCharArray();
        out.println("Ingresa el nom de la tercera ciutat:");
        c3 = sc.nextLine();
        //Transformo el String a array de char
        char[] city3= new char[c3.length()];
        city3= c3.toCharArray();
        out.println("Ingresa el nom de la quarta ciutat:");
        c4 = sc.nextLine();
        //Transformo el String a array de char
        char[] city4= new char[c4.length()];
        city4= c4.toCharArray();
        out.println("Ingresa el nom de la cinquena ciutat:");
        c5 = sc.nextLine();
        //Transformo el String a array de char
        char[] city5= new char[c5.length()];
        city5= c5.toCharArray();
        out.println("Ingresa el nom de la sisena ciutat:");
        c6 = sc.nextLine();
        //Transformo el String a array de char
        char[] city6= new char[c6.length()];
        city6= c6.toCharArray();
        //Tanquem la clase scanner per no tenir conflictes
        sc.close();

        System.out.println("[ " + c1 + " - " + ciutatInversa(city1) + " ]");
        System.out.println("[ " + c2 + " - " + ciutatInversa(city2) + " ]");
        System.out.println("[ " + c3 + " - " + ciutatInversa(city3) + " ]");
        System.out.println("[ " + c4 + " - " + ciutatInversa(city4) + " ]");
        System.out.println("[ " + c5 + " - " + ciutatInversa(city5) + " ]");
        System.out.println("[ " + c6 + " - " + ciutatInversa(city6) + " ]");

    }
    //Faig una funció per fer inversa el array char de les ciutats
    public static String ciutatInversa(char[] ciutat) {
        String inversa="";
        int length= ciutat.length;
        for(int i=length-1; i>=0;i--) {
            inversa+=ciutat[i];
        }
        return inversa;
    }
}
