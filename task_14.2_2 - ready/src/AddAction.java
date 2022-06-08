public class AddAction extends BaseHandler {
    @Override
    public void doAction(float a, float b, String action) {
        if (action.equals("add")) {
            float result=a+b;
            System.out.println(a + "+" + b + "=" + result);
        }
        else {
            super.doAction(a, b, action);
        }
    }
}
