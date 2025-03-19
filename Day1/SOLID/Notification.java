interface IMessage {
    String getMessageContent();
}

interface INotification {
    void notify(IMessage message);
}

class EmailMessage implements IMessage {
    private final String content;

    public EmailMessage(String content) {
        this.content = content;
    }

    @Override
    public String getMessageContent() {
        return content;
    }
}

class SMSMessage implements IMessage {
    private final String content;

    public SMSMessage(String content) {
        this.content = content;
    }

    @Override
    public String getMessageContent() {
        return content;
    }
}

class PushMessage implements IMessage {
    private final String content;

    public PushMessage(String content) {
        this.content = content;
    }

    @Override
    public String getMessageContent() {
        return content;
    }
}

class WhatsappMessage implements IMessage {
    private final String content;

    public WhatsappMessage(String content) {
        this.content = content;
    }

    @Override
    public String getMessageContent() {
        return content;
    }
}

class EmailNotification implements INotification {
    @Override
    public void notify(IMessage message) {
        System.out.println("Sending Email: " + message.getMessageContent());
    }
}

class SMSNotification implements INotification {
    @Override
    public void notify(IMessage message) {
        System.out.println("Sending SMS: " + message.getMessageContent());
    }
}

class PushNotification implements INotification {
    @Override
    public void notify(IMessage message) {
        System.out.println("Sending Push Notification: " + message.getMessageContent());
    }
}

class WhatsappNotification implements INotification {
    @Override
    public void notify(IMessage message) {
        System.out.println("Sending Whatsapp Notification: " + message.getMessageContent());
    }
}
