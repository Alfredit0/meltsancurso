/**
* Hello world en java
* @autor Alfredo Reyes
* @version 1
*/
public class  Hello{
	static boolean result;
	static char option;
	static double grade;
	private String valor;
	private static final String BLANK_MESSAGE="No existe un string";

	public Hello(){}

	public Hello(String val){
		this.valor=val;
	}
	public String toString(){
		
		return this.isBlank(this.valor).isEmpty()?BLANK_MESSAGE:this.valor;
	}

	public String isBlank(String cadena){
		return (cadena==null)? "":cadena;
	}
	
	public static void main(String[] args) {
		//Imprimiendo hello world
		System.out.println("Hello");
		System.out.println("World");
		//Imprimiendo variables sin inicializar
		/*System.out.println(result);
		System.out.println(option);
		System.out.println(grade);*/
		//Asignando valores a las variables
		result=true;
		option='C';
		grade=0.0;
		//Imprimiendo variables inicializadas
		/*System.out.println(result);
		System.out.println(option);
		System.out.println(grade);*/
		//Se instancia un objeto Hello pasando un parametro String al constructor
		Hello a = new Hello("Se inicializa el string");
		//Se instancia un objeto Hello pasando un parametro String al constructor
		Hello b = new Hello();
		//Imprimiendo el objeto. Aqui es donde llama al metodo toString
		System.out.println(b);
		System.out.println(a);

	}
 
}
