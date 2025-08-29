package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {
    public String reply(String message, ReplyType type) {
        String normalized = message.trim().toLowerCase();
        // TODO: Implement mapping according to README canonical expectations.
        // Requirements:
        // - null or blank -> "Please say something."
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }
        // - For known messages, return exact string for each ReplyType.
        if (normalized.equals("hi")) {
            if (type == ReplyType.FORMAL) {
                return "Hello. How may I assist you today?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Hey there! 😊 How can I help?";
            }else {
                return "Hello. How can I help?";
            }
        }
        else if (normalized.equals("hello")) {
            if (type == ReplyType.FORMAL) {
                return "Hello. How may I assist you today?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Hi! 👋 What’s up?";
            }else {
                return "Hello. How can I help?";
            }
        }
        else if (normalized.equals("how are you")) {
            if (type == ReplyType.FORMAL) {
                return "I am functioning properly. How may I assist you?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Doing great! 😄 How can I help?";
            } else {
                return "I’m good. How can I help?";
            }
        }
        else if (normalized.equals("i need help")) {
            if (type == ReplyType.FORMAL) {
                return "I can assist with that. Please provide more details.";
            } else if (type == ReplyType.FRIENDLY) {
                return "I’ve got you! 🙂 Tell me a bit more.";
            } else {
                return "Share details; I’ll help.";
            }
        }
        else if (normalized.equals("can you help me with my account")) {
            if (type == ReplyType.FORMAL) {
                return "Certainly. Please describe the account issue.";
            } else if (type == ReplyType.FRIENDLY) {
                return "Sure thing! 😊 What’s wrong with the account?";
            } else {
                return "Describe the account issue…";
            }
        }
        else if (normalized.equals("thanks")) {
            if (type == ReplyType.FORMAL) {
                return "You are welcome.";
            } else if (type == ReplyType.FRIENDLY) {
                return "Anytime! 🙌";
            } else {
                return "You’re welcome.";
            }
        }
        else if (normalized.equals("bye")) {
            if (type == ReplyType.FORMAL) {
                return "Goodbye.";
            } else if (type == ReplyType.FRIENDLY) {
                return "See you later! 👋";
            } else {
                return "Goodbye.";
            }
        }
        else if (normalized.equals("what is your name")) {
            if (type == ReplyType.FORMAL) {
                return "I am your virtual assistant.";
            } else if (type == ReplyType.FRIENDLY) {
                return "I’m your helper bot 🤖";
            } else {
                return "I’m your assistant.";
            }
        }
        // - For unknown messages, return the 'any other text' mapping.
        else {
            if (type == ReplyType.FORMAL) {
                return "Could you clarify your request?";
            } else if (type == ReplyType.FRIENDLY) {
                return "Could you tell me more?";
            }else {
                return "Please clarify.";
            }
        }
    }
}
