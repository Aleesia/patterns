public class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void doAction(float a, float b, String action) {
        if (next != null){
            next.doAction(a, b, action);
        } else {
            System.out.println("Unhandled request " + action);
        }
    }
}
