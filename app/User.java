public class User {
    String name;
    String description;
    int id;
    boolean followed;

    public User(String n, String d, int id, boolean f) {
        this.name = n;
        this.description = d;
        this.id = id;
        this.followed = f;
    }
}
