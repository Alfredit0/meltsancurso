import javax.swing.JOptionPane;
import java.lang.*;
/**
 *
 * @author Alfredo Reyes
 * @version 1.0
 */
public class InputFromKeyboardJOptionPane {

    public InputFromKeyboardJOptionPane() {
    }


    public static void main(String[] args) {
        //Declaracion de variables
        String name = "";
        int age=0;
        String msg;
        //Lee el nombre
        name=JOptionPane.showInputDialog("Please enter your name");
        try{
        //Lee la edad
        age= Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        }
        catch (NumberFormatException e) {
            //Si no ingresa un numero envia un mensaje
            JOptionPane.showMessageDialog(null, "Error. Not number");
            return;
        }
        //Toma una decision con respecto a la edad
        if (age>100) {
          msg = "Hello " + name + ", you are old!";
        }else{
          msg = "Hello " + name + ", you are young!";
        }
        //Muestra el mensaje
        JOptionPane.showMessageDialog(null, msg);
    }

}
