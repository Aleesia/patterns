public interface Mediator {

    void sendMessageAll(String message, String userFrom);
    void sendMessage(String message, String userFrom, String userTo);
    void sendMessageSelected(String message, String userFrom, String[] usersTo);

}
