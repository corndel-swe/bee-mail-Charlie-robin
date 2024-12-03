package beemail;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = Messenger.getInstance();

        User charlie = new User("123", "Charlie");
        User violet = new User("456", "Violet");
        User mike = new User("789", "Mike");

        messenger.login(charlie);
        messenger.login(violet);
        messenger.login(mike);

        charlie.sendMessage("456", "Hello");

        violet.readMessage(0);

        violet.sendMessage("123", "Hey");
        charlie.readMessage(0);
    }
}
