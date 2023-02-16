import java.util.Scanner;

public class Remate {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); //se crea un objeto de la clase Scanner
        System.out.println("Digite el precio de todos lo productos"); //println es un metodo
        int amount = lectura.nextInt();
        System.out.println("Digite la cantidad de productos"); 
        int price = lectura.nextInt();
        int total = amount * price;
        System.out.println("el valor de la compra es:"+total); 
        System.out.println("Ingrese el valor con el que paga:"); 
        int valorpaga = lectura.nextInt();
        int cambio = valorpaga-total;
        System.out.println("su cambio es: "+cambio); 
        lectura.close();
    }
    
}
