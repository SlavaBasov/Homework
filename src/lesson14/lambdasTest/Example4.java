package lesson14.lambdasTest;

public class Example4 {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        UserBuilder userBuilder2 = i -> new User(i);
        User user = userBuilder.create("Володя");
        User user2 = userBuilder2.create("Сашка");
        System.out.println(user.getName());
        System.out.println(user2.getName());

    }
}

interface UserBuilder{
    User create(String name);
}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
