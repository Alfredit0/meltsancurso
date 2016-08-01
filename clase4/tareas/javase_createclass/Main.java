/**
*@autor Alfredo Reyes
*@version 1.0
*/
public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Irene", 9.0, 7.0, 9.0);

		Student.increaseStudentCount();

		Student student2 = new Student(2, "Belen", 8.0, 9.0, 10.0);

		Student.increaseStudentCount();

		Student student3 = new Student(3, "Fany", 10.0, 10.0, 9.0);

		Student.increaseStudentCount();

		System.out.println("Total de Estudiantes: " + Student.getStudentCount());

		System.out.println(student1.getDatos()+"\n");

		System.out.println(student2.getDatos()+"\n");

		System.out.println(student3.getDatos()+"\n");
	}

}
