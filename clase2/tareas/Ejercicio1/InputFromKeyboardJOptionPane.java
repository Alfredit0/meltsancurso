import javax.swing.JOptionPane;

/**
 *
 * @author Alfredo Reyes
 * @version 1.0
 */
public class InputFromKeyboardJOptionPane {

    public InputFromKeyboardJOptionPane() {
    }


    public static void main(String[] args) {
        String name = "";
        int age=0;
        String msg;

        name=JOptionPane.showInputDialog("Please enter your name");
        age= Integer.parseInt(JOptionPane.showInputDialog("Please enter your name"));

        if (age>100) {
          msg = "Hello " + name + ", you are old!";
        }else{
          msg = "Hello " + name + ", you are young!";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

}
