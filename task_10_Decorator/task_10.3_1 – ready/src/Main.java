public class Main {
    public static void main(String[] args) {
        Component greeting = new PrintableString("");
        greeting = new PostComaDecorator(greeting);
        greeting = new PostWordDecorator(greeting, "World");
        greeting = new PreWordDecorator(greeting, "Hello");
        greeting = new PostExclaimDecorator(greeting);

        greeting.print();

    }
}
