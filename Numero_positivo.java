import java.util.Scanner;

public class Numero_positivo {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numberOne = lectura.nextInt();
        if (numberOne>0) 
        {
        System.out.println("El numero "+ numberOne+ " es positivo" );
        } 
        else if (numberOne<0){
          System.out.println("El numero "+ numberOne+ " es negativo");
        }
        else if(0==numberOne){
            System.out.println("El numero "+ numberOne+ " es neutro");
        }
        lectura.close();
    }
}
