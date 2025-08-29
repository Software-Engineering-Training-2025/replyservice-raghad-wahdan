package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReplyService service = new ReplyService();
        String [] inputs = {"hi", "hello", "how are you", "i need help", "can you help me with my account",
        "thanks", "bye", "what is your name", "random test", " ", null};
        for (ReplyType type : ReplyType.values()) {
            System.out.println("=== Testing type: " + type + " ===");
            for (String in : inputs) {
                String label = (in == null ? "null" : "\"" + in + "\"");
                String reply = service.reply(in, type);
                System.out.println("Input: " + label + " → Reply: " + reply);
            }
            System.out.println();
        }
    }
}
