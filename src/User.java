import java.util.HashMap;

public class User {
    private static final HashMap<String, User> users = new HashMap<String, User>();
    public static int totalUsers = 0;
    private String username;
    private String password;
    private String gender;
    private int age;
    public User(String username, String password, String gender,int age){
        totalUsers++;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        users.put(username, this);
    }

    public static User getUser(String username) {
        return users.get(username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
