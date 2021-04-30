public class Main {

    public static void main(String[] args) {
	    Instructor instructor1 = new Instructor(1,"Engin","Demiroğ",
                "engindemiroğ.@gmail.com","1234","JAVA + REACT","12341241234");

	    InstructorManager instructorManager = new InstructorManager();
	    instructorManager.login();
	    instructorManager.add(instructor1);

	    Student student1 = new Student(2,"Emre Kaan","Seylim",
                "emrekaan.seylim@gmail.com","12532","Üniversite","3","124314321");

		StudentManager studentManager = new StudentManager();
		studentManager.login();
		studentManager.add(student1);

    }
}
