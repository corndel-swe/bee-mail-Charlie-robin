package beemail;

public class Main {
    public static void main(String[] args) {
        App app = App.getInstance();

        User charlie = new User("123", "Charlie");
        User violet = new User("456", "Violet");
        User mike = new User("789", "Mike");

        app.login(charlie);
        app.login(violet);
        app.login(mike);

        charlie.sendMessage("456", "Hello");
        violet.readMessage(0);

        violet.sendMessage("123", "Hey");
        charlie.readMessage(0);
    }
}
