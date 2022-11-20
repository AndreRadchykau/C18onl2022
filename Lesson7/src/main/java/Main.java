public class Main {
    public static void main(String[] args) {
        User user = new User("Jackie", "Chan", 68, "male");
        System.out.println(user.setNameSurname());
        System.out.println(user.userOutput());
        System.out.println(user.getAge());
        User userTwo = new User("John", "Wick");
        System.out.println(userTwo);
    }
}

