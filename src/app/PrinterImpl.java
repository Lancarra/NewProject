package app;

public class PrinterImpl implements Printer {

    @Override
    public void print(Message message) {
        // Check if both the text and sender fields are null or empty
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {

            // Create an anonymous class to handle the empty message
            Printer emptyMessageHandler = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("An empty message from an anonymous user is being processed...");
                }
            };
            emptyMessageHandler.print(message);

            // If sender is null or empty, treat it as an anonymous user
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("An anonymous user sent a message: " + message.getText());

            // If both text and sender are present, print the message normally
        } else {
            System.out.println("User " + message.getSender() + " sent a message: " + message.getText());
        }
    }

    public static void main(String[] args) {
        // Create an instance of Printer
        Printer printer = new PrinterImpl();

        // Example of a message from an anonymous user
        Message anonymousMessage = new Message("Hello!", null);
        printer.print(anonymousMessage);

        // Example of a message from a specific user
        Message userMessage = new Message("How are you?", "John");
        printer.print(userMessage);

        // Example of an empty message
        Message emptyMessage = new Message(null, null);
        printer.print(emptyMessage);
    }
}
