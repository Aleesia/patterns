public class Client {
    public static void main(String[] args) {

        Handler add = new AddAction();
        Handler subtract = new SubAction();
        Handler multiply = new MultAction();

        add.setNext(subtract);
        subtract.setNext(multiply);

        float a=2.34f;
        float b=3.01f;
        add.doAction(a, b, "add");
        add.doAction(a, b, "multiply");

        multiply.doAction(a, b, "add");
    }
}
