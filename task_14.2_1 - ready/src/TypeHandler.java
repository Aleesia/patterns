public class TypeHandler implements Handler {

    private Handler next;

    @Override
    public void open(String filename) {
        if (next != null) {
            next.open(filename);
        }
        else {
            System.out.println("No next handler. Failed to open " + filename);
        }
    }

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public String getType(String filename) {
        String[] results = filename.split("\\.", 2);
        return results[1];
    }
}
