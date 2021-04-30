public class Instructor extends User{
    private String courses;
    private String phoneNumber;
    private String biography;

    public Instructor(int id, String firstName, String lastName, String email, String password, String courses, String phoneNumber) {
        super(id, firstName, lastName, email, password);
        this.courses = courses;
        this.phoneNumber = phoneNumber;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
