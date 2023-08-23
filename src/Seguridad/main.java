package Seguridad;

public class main {
    public static void main(String[]args){
        Password password1 = new Password();
        password1.setLongitud(10);
        System.out.println(password1.generarContraseña());
    }
}
