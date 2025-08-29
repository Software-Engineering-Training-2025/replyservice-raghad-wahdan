package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReplyService service = new ReplyService();

        String reply1 = service.reply("hi", ReplyType.FORMAL);
        System.out.println(reply1);  // Hello. How may I assist you today?

        String reply2 = service.reply("hello", ReplyType.FRIENDLY);
        System.out.println(reply2);  // Hi! 👋 What’s up?

        String reply3 = service.reply("random", ReplyType.CONCISE);
        System.out.println(reply3);  // Please clarify.

        String reply4 = service.reply("   ", ReplyType.FORMAL);
        System.out.println(reply4);  // Please say something.
    }
}
