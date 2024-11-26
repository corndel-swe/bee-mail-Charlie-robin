package beemail;

public interface MessageMediator {
    void login(User user);

    void deliver(User sender, String recipientId, String content);
}
