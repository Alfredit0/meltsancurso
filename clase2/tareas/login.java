import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class login {
  private static final String PASSWORD="12345";

    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new
                InputStreamReader( System.in) );

        String username = "";
        String password = "";
        do {
          System.out.println("Ingresa el nombre de usuario: ");

          // Read data into name variable
          try{
              username = dataIn.readLine();
              username=username.trim();
          }catch( IOException e ){
              System.out.println("Error!");
          }
        } while (username.equals(""));


        for(int i=1;i<=3 &&!PASSWORD.equals(password);i++){
          System.out.println("Ingresa la contraseña: ");

          // Read data into name variable
          try{
              password = dataIn.readLine();
          }catch( IOException e ){
              System.out.println("Error!");
          }
        }

        if(PASSWORD.equals(password)
        ){
          System.out.println("Bienvenido "+username);
        }else{
          System.out.println("Completo los 3 intentos");
        }

    }

}
