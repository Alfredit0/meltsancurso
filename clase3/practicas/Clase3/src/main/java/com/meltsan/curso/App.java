/**
 * Pide usuario y contraseña. Solo 3 intentos para la contraseña y el nombre es necesario
 * @author Alfredo Reyes
 * @version 1.0
 */
package com.meltsan.curso;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	  private static final String PASSWORD="12345";

	    public static void main(String[] args) {

	        BufferedReader dataIn = new BufferedReader(new
	                InputStreamReader( System.in) );

	        String username = "";
	        String password = "";
	        long start =System.currentTimeMillis();
	        do {
	          System.out.println("Ingresa el nombre de usuario: ");

	          // Read data into name variable
	          try{
	              username = dataIn.readLine();
	              username=notBlank(username);
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
	        long end =System.currentTimeMillis();
	        System.out.println(end-start);	        
	    }
	    
	    private static String notBlank(String s){
	    	if(s.equals(null)){
	    		return "";
	    	}else{
	    	return s.trim();
	    	}
	    }

}