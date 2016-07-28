/**
*Write a program in which the following properties are added to a
*Properties object called myProperties.  Use setProperty() method.
*    mykey20=myValue20
*    mykey30=myValue30
*    mykey40=myValue40
*Display the properties via list() method.
*@autor Alfredo Reyes
*@version 1.0
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyOwnProject {

    public static void main(String[] args) {

        Properties myProperties = null;

        myProperties= new Properties();

        // set a property through setProperty() method
        myProperties.setProperty("mykey20", "myValue20");
        myProperties.setProperty("mykey30", "myValue30");
        myProperties.setProperty("mykey40", "myValue40");

        // display new properties
        myProperties.list(System.out);
    }
}
