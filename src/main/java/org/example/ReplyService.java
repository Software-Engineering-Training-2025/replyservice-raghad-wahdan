package org.example;

public class ReplyService {

    public String reply(String message, ReplyType type) {
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }

        String normalized = message.trim().toLowerCase();

        if (normalized.equals("hi")) {
            if (type == ReplyType.FORMAL) {
                return "Hello. How may I assist you today?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Hey there! 😊 How can I help?";
            } else {
                return "Hello. How can I help?";
            }

        } else if (normalized.equals("hello")) {
            if (type == ReplyType.FORMAL) {
                return "Hello. How may I assist you today?";
            } else if (type == ReplyType.FRIENDLY) {
                // What’s = \u2019
                return "Hi! 👋 What\u2019s up?";
            } else {
                return "Hello. How can I help?";
            }

        } else if (normalized.equals("how are you")) {
            if (type == ReplyType.FORMAL) {
                return "I am functioning properly. How may I assist you?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Doing great! 😄 How can I help?";
            } else {
                // I’m = \u2019
                return "I\u2019m good. How can I help?";
            }

        } else if (normalized.equals("i need help")) {
            if (type == ReplyType.FORMAL) {
                return "I can assist with that. Please provide more details.";
            } else if (type == ReplyType.FRIENDLY) {
                // I’ve = \u2019
                return "I\u2019ve got you! 🙂 Tell me a bit more.";
            } else {
                // I’ll = \u2019
                return "Share details; I\u2019ll help.";
            }

        } else if (normalized.equals("can you help me with my account")) {
            if (type == ReplyType.FORMAL) {
                return "Certainly. Please describe the account issue.";
            } else if (type == ReplyType.FRIENDLY) {
                // What’s = \u2019
                return "Sure thing! 😊 What\u2019s wrong with the account?";
            } else {
                // … = \u2026
                return "Describe the account issue\u2026";
            }

        } else if (normalized.equals("thanks")) {
            if (type == ReplyType.FORMAL) {
                return "You are welcome.";
            } else if (type == ReplyType.FRIENDLY) {
                return "Anytime! 🙌";
            } else {
                // You’re = \u2019
                return "You\u2019re welcome.";
            }

        } else if (normalized.equals("bye")) {
            if (type == ReplyType.FORMAL) {
                return "Goodbye.";
            } else if (type == ReplyType.FRIENDLY) {
                return "See you later! 👋";
            } else {
                return "Goodbye.";
            }

        } else if (normalized.equals("what is your name")) {
            if (type == ReplyType.FORMAL) {
                return "I am your virtual assistant.";
            } else if (type == ReplyType.FRIENDLY) {
                // I’m = \u2019
                return "I\u2019m your helper bot 🤖";
            } else {
                // I’m = \u2019
                return "I\u2019m your assistant.";
            }

        } else {
            if (type == ReplyType.FORMAL) {
                return "Could you clarify your request?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Could you tell me more?";
            } else {
                return "Please clarify.";
            }
        }
    }
}
