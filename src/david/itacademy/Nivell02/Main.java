package david.itacademy.Nivell02;

import java.util.Scanner;

public class Main {
    /*
    En aquest exercici crearàs un array bidimensional on introduiràs 3 notes per a 5 alumnes.
    Es calcularà la nota mitjana de cada alumna i s'indicarà si han suspès o no.
    Crea un array  bidimensional capaç de guardar 3 notes de 5 alumnes.
    Omple l’array amb un bucle demanant els valors per pantalla (nota entre 0 i 10),
    has d’identificar per pantalla quan és una agrupació d’un alumne nou . Recorre l'array,
    fes la Mitjana aritmètica de les 3 notes i indica si l'alumne ha aprovat o suspès
     */
    public static void main(String[] args) {
        //Variables
        int notes;
        String dades;

        //Clase Scanner per recollir dades
        Scanner sc = new Scanner(System.in);
        //Array alumnes notas
        int [][] alumnesNotes= new int[5][3];
        //Ho mostro dintre de un bucle dowhile per si en el cas que el profesor s'hagi equivocat torni a introduïr les dades
        do{
            System.out.println("----INTRODUÏR NOTES DELS 5 ALUMNES----");
            //Demanem notes
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Introdueix la nota " + (j+1) + " per a l' alumne " + (i+1) + " :");
                    notes=sc.nextInt();
                    alumnesNotes[i][j]=notes;
                }
                System.out.println();
            }
            //Mostrem les dades
            System.out.println("----DADES INTRODUïDES DELS 5 ALUMNES----");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("[ Alumene: " + (i+1) +" a la qualificació " + (j+1) + " una nota : " + alumnesNotes[i][j] + " ]");

                }
                System.out.println("------------------------");

            }

            System.out.println("¿Les dades introduïdes son correctes? S/N");
            dades=sc.next();

        }while (!dades.equalsIgnoreCase("S"));

        sc.close();


        //Mitjana Aritmética
        System.out.println("----MITJANES DELS 5 ALUMNES----");
        for (int i = 0; i < 5; i++) {
            double mitjana=0;
            int suma=0;
            for (int j = 0; j < 3; j++) {
                suma+=alumnesNotes[i][j];
                mitjana=(double)suma/3;
            }

            //He arrodonit les mitjanes ya que en quasi tots el centres la nota mitjà es fa deixant el número sense.
            if(Math.round(mitjana)>=5)System.out.println("L'alumne " + (i+1) + " a aprobat amb un :" + Math.round(mitjana));
            else System.out.println("L'alumne " + (i+1) + " a suspés amb un :" + Math.round(mitjana));
        }
    }
}
