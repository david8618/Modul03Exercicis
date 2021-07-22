package david.itacademy.Nivell03;

import java.util.Scanner;

public class Main {
    /*Escriviu un programa que donat un numero N retorni la seqüència de Fibonacci
    fins al numero N.La seqüència de Fibonacci és la sèrie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    El número següent es troba sumant els dos números anteriors.
     */

    public static void main(String[] args) {
        //Variables per calcular la serie Fibonacci
        int a=0, b=1, c, fibo;
        //Creem un objecte scanner per recullir el numero per la seqüència
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdueix el numero per la seqüència Fibonacci: ");
        fibo=sc.nextInt();
        //Mostrarem el calcul de la serie fins el numero indicat per l'usuari.
        System.out.println("La seqüència Fibonacci de " + fibo + " es:");
        for (int i = 0; i < fibo; i++) {
            System.out.print(a + " / ");
            c=a+b;
            a=b;
            b=c;
        }
        //Tanquem l'objecte sc per no tenir conflictes
        sc.close();
    }
}
