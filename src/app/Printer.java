package app;

public interface Printer {

    // Static inner class Message to encapsulate message details
    public static class Message {
        private String text;
        private String sender;

        // Constructor to initialize text and sender fields
        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        // Getter for the text field
        public String getText() {
            return text;
        }

        // Setter for the text field
        public void setText(String text) {
            this.text = text;
        }

        // Getter for the sender field
        public String getSender() {
            return sender;
        }

        // Setter for the sender field
        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    // Method to print the message, which needs to be implemented by a class
    void print(Message message);
}
