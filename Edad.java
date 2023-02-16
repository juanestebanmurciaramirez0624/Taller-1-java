import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {

        int anio_actual=0;
        int anio_de_nacimiento=0;
        int edad=0;

        Scanner Lectura = new Scanner(System.in); {
            System.out.println("Porfavor ingrese el año acutal");
            anio_actual=Lectura.nextInt();

            System.out.println("Porfavor ingrese el año de nacimiento");
            anio_de_nacimiento=Lectura.nextInt();
            
            edad=anio_actual - anio_de_nacimiento;

            System.out.println("Su edad actal es de "+edad+" años");
            Lectura.nextLine();

            System.out.println("Porfavor ingrese el año acutal");
            anio_actual=Lectura.nextInt();

            System.out.println("Porfavor ingrese el año de nacimiento");
            anio_de_nacimiento=Lectura.nextInt();
            
            edad=anio_actual - anio_de_nacimiento;

            System.out.println("Su edad actal es de "+edad+"años");
            Lectura.nextLine();


            System.out.println("Porfavor ingrese el año acutal");
            anio_actual=Lectura.nextInt();

            System.out.println("Porfavor ingrese el año de nacimiento");
            anio_de_nacimiento=Lectura.nextInt();
            
            edad=anio_actual - anio_de_nacimiento;

            System.out.println("Su edad actal es de "+edad+"años");
            Lectura.nextLine();
            Lectura.close();
        }


    }

    
    
}