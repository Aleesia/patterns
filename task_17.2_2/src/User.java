public interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void sendMessageSelected(String message, String[] usersTo);
    void receiveMassage(String message, String userFrom);
}
