import java.util.Scanner;

public class Discoteca {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        int age = lectura.nextInt();
        if (age<18) {
            System.out.println("Usted es menor de 18 años, pa su casa");
            
        } else {
            System.out.println("Usted es mayor de edad, dele pa dentor");            
        }
        lectura.close();
    }
}
