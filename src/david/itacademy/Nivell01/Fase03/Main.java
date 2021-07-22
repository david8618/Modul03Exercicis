package david.itacademy.Nivell01.Fase03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Cambieu les vocals “a” dels noms de les ciutats per el numero 4
    i guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
    Mostreu per consola l’array modificat i ordenat per ordre alfabetic.
     */
    public static void main(String[] args) {
        //Variables ciutats
        String c1 = "", c2 = "", c3 = "", c4 = "", c5 = "", c6 = "";

        //Demanen al usuari els noms de les ciutats per consola. Per recollir aquestas dades fem us de la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nom de la primera ciutat:");
        c1 = sc.nextLine();
        System.out.println("Ingresa el nom de la segona ciutat:");
        c2 = sc.nextLine();
        System.out.println("Ingresa el nom de la tercera ciutat:");
        c3 = sc.nextLine();
        System.out.println("Ingresa el nom de la quarta ciutat:");
        c4 = sc.nextLine();
        System.out.println("Ingresa el nom de la cinquena ciutat:");
        c5 = sc.nextLine();
        System.out.println("Ingresa el nom de la sisena ciutat:");
        c6 = sc.nextLine();
        //Tanquem la clase scanner per no tenir conflictes
        sc.close();
        //Guardem les dades a un arrayCiutats
        //ArrayCiutats
        String[] arrayCiutats = {c1, c2, c3, c4, c5, c6};
        /*
        copiar una array d'aquesta manera fa que els dos arrays tinguin diferent Hash Code.
        Això vol dir que la matriu nou és una còpia nova seu contingut s'emmagatzema en una nova zona de memòria.
        Per això el seu Hash Code és diferent a el del arrayOrigen.
         */
        String[] arrayCiutatsModificades =(String[])arrayCiutats.clone();

        for (int i = 0; i < arrayCiutatsModificades.length; i++) {
            //Dintre del loop l'indico que modifiqui tant el carrectar a como A per un el valor 4, podemo trobarnos amb ciutats que tinguin una A al inici.
            arrayCiutatsModificades[i]=arrayCiutatsModificades[i].replace('a', '4').replace('A','4');
        }
        //Ordenem
        Arrays.sort(arrayCiutatsModificades);
        //Mostrem l'array
        for (String modificadas:arrayCiutatsModificades) { System.out.println(modificadas); }
    }
}

