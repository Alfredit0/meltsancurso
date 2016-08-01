public class Student {

	private StudentRecord studentRecord;
	private int studentID;
	private static int studentCount = 0;

	public Student() {
	}

	public Student(int id, String name, double mGrade, double eGrade,
            double sGrade) {
		this.studentID = id;
		this.studentRecord = new StudentRecord(name, mGrade, eGrade, sGrade);
	}

	public String getDatos(){
		return "Id de Estudiante: " + this.getStudentID()+
				"\tNombre de estudiante: " + this.studentRecord.getName() +
				"\nCalificacion de Matemáticas: " + this.studentRecord.getMathGrade() +
				"\nCalificacion de Ingles: " + this.studentRecord.getEnglishGrade() +
				"\nCalificacion de ciencias: " + this.studentRecord.getScienceGrade() +
				"\nPromedio: " + this.studentRecord.getAverage();
	}

	public StudentRecord getStudentRecord() {
		return studentRecord;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void setStudentRecord(StudentRecord studentRecord) {
		this.studentRecord = studentRecord;
	}

	public static int getStudentCount(){
	       return studentCount;
	}

	public static void increaseStudentCount(){
	       studentCount++;
	}
}
