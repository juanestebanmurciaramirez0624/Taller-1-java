import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String usu = "juan";
        String passw = "1234";
        if (usu.equals("juan") && passw.equals("1234")) {
            System.out.println("Datos correctos");
        }
        else if (usu.equals("juan") && passw != passw){
            System.out.println("Parece que no recuesdas tu contraseña");
        }
        else if (usu != usu && passw.equals("1234")){
            System.out.println("Tus credenciales son diferentes");
        } 
        else if (usu != usu && passw != passw){
            System.out.println("Acceso denegado");
        }
    }
}
