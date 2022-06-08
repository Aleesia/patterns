public interface Handler {
    void setNext(Handler handler);
    void doAction(float a, float b, String action);
}
