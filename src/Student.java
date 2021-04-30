public class Student extends User{
    private String school;
    private String schoolClass;
    private String studentNumber;

    public Student(int id, String firstName, String lastName, String email, String password, String school, String schoolClass, String studentNumber) {
        super(id, firstName, lastName, email, password);
        this.school = school;
        this.schoolClass = schoolClass;
        this.studentNumber = studentNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
