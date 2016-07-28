import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.*;
public class buffer{
private static final String password="12345";

 public static void main(String [] args){
  BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in    )); 
int grade=0;
String mensaje="";
char var;
System.out.println("Please enter grade");  
try{
   grade =Integer.parseInt( dataIn.readLine());
    }catch(IOException e){
	System.out.println("Error in getting input");
	return;
    }catch(NumberFormatException e){
	System.out.println("No se ingreso un numero entero");
	return;
	}
 /* 60-70 -C
 *   71-80-B
 *   81-90-A
 *   91-99-A+
 *   99-100-S
 *  S-A mencion honorifica
 *  C pansazo
 *  B Nice
 *  Default reprobaste
 */
  if(grade>=60 && grade<=70){
	var='C';
  }else if(grade>=71 && grade<=80){
  var='B';
 }
 else if(grade>=81 && grade <=90){
  var='A';
 }
 else if(grade>=91 && grade<=98){
  var='A';
 }
 else if(grade>=99 && grade<=100){
  var='S';
 }
 else{
  var='X';
 }
 switch(var){
	case 'A': case 'S': System.out.println("Mencion honorifica");
	break;
	
	case 'B': System.out.println("Nice");
	break;
	
	case 'C': System.out.println("Panzaso");
	break;

	default: System.out.println("Reprobaste");
	}

do{
System.out.println("Grade: "+grade);
grade++;
}while(grade<=100);
}
}
