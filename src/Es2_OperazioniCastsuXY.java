/*Esercizio 2:
Si scriva un programma che effettua le seguenti attività.
● Utilizzare Scanner per leggere un numero in virgola mobile x.
● Convertire x in un valore intero e memorizzare il risultato in y.
● Visualizzare in maniera distinta x e y.
● Convertire x in un valore di tipo byte e memorizzare il risultato in z.
● Visualizzare in maniera distinta x e z.
*/

import java.util.Scanner;
public class Es2_OperazioniCastsuXY {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.println("CAST SU X e Y");
        System.out.println("Si ingressi un numero in virgola mobile chiamato X: ");
        float x= op.nextFloat();
        int y= (int) x;
        System.out.println("X tipo float= " +x +"\nX come intero in Y= "+y);
        byte z= (byte) x;
        System.out.print("X come 'byte' dentro Z= "+z);

    }
}