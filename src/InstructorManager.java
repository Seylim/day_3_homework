public class InstructorManager extends UserManager{
    @Override
    public void login() {
        System.out.println("Eğitmen olarak giriş yapıldı.");
    }

    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " Eğitmen olarak eklendi.");
    }

    @Override
    public void multipleAdd(User[] users) {
        for (User user:users){
            System.out.println(user.getFirstName() + " Eğitmen olarak eklendi.");
        }
    }
}
