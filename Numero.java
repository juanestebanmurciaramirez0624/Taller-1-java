import java.util.Scanner;

public class Numero {
  public static void main(String[] args) {
    Scanner lectura= new Scanner(System.in);
    System.out.println("Digite dos numeros: ");
    int numberOne = lectura.nextInt();
    int numberTwo = lectura.nextInt();
    if (numberOne>numberTwo) 
    {
       int total=numberOne+numberTwo;   
       System.out.println("El numero "+ numberOne+ " es mayor que el numero "+numberTwo+ " y el resultado de la suma es: "+total);
    } 
    else if (numberOne==numberTwo){
      int total=numberOne*numberTwo;
      System.out.println("El numero "+ numberOne+ " es igual que el numero "+numberTwo+ "y el resultado de la multiplicaciones es: "+total) ;
    }
    else {
        int total=numberTwo-numberOne;
        System.out.println("El numero "+ numberTwo+ " es mayor que el numero "+numberOne+" y el resultado de la resta es: "+total);
    }
    lectura.close();
  }   
}
