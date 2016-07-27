/**
* Calcula el numero mas pequeño 
* e imprime un mensaje si es menor o mayor o igual a 10
* @autor Alfredo Reyes
* @version 1.0
*/
public class GreatestValue {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de los numeros
        int num1 = 12;
        int num2 = 23;
        int num3 = 3;
        int min = 0;

        //Declaracion y asignacion de los mensajes
        String mensaje1, mensaje2, mensajeFinal;
        mensaje1="The smallest number is less than 10!";
        mensaje2="The smallest number is greater than or equal to 10!";

        //determina el numero menor
        min = (num1<num2)?num1:num2;
        min = (min<num3)?min:num3;
        
        //determina el mensaje final a mostrar
        mensajeFinal=(min<10)?mensaje1:mensaje2;

        //imprime los numeros
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);

        //Imprime el numero mas pequeño
        System.out.println("The smallest number is = "+min);

        //Imprime el mensajeFinal establecido
        System.out.println(mensajeFinal);
    }
    
}
