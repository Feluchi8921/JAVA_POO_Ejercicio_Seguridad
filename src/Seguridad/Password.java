package Seguridad;

public class Password {

    //Atributos
    int longitud;
    String password;

    //Constantes
    public static final int LENGHTPASSWORD=10;
    //Constructores

    public Password() {
        this.longitud = LENGHTPASSWORD;
        this.password = password;
    }

    public Password(int longitud) {
        this.password = password;
    }

    //Metodos
    //Geters y Setter (contraseña no debe tener seter)
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    //Generar contraseña
    public String generarContraseña(){
        String password="";
        for(int i=0; i<longitud;i++){
            int eleccion=((int)Math.floor(Math.random()*3+1));
            if(eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(122-97)+97));
                password+=minusculas;
            }
            else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(90-65)+65));
                    password+=mayusculas;
                }
                else{
                    char numeros=(char)((int)Math.floor(Math.random()*(57-49)+49));
                    password+=numeros;
                }

            }
        }
        this.password=password;
        return password;
    }


}
