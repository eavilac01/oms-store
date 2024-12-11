package print_messages;

public class Messages {

    private final String messagesText;
    private final String messagesButton;
    private final String messagesUser;
    private final String messagesPass;
    private final String messagesCamp;
    private final String messagesCloseSession;
    private final String scrollMessages;
    private final String timeSleepWait;

    public Messages(){
        this.messagesText = "THE TEXT CORRESPONDS TO:";
        this.messagesButton = "THE BUTTON HAS BEEN CLICKED:";
        this.messagesUser = "EMAIL HAS BEEN ENTERED:";
        this.messagesPass = "PASSWORD HAS BEEN ENTERED:";
        this.messagesCamp = "IN THE COUNTRYSIDE";
        this.messagesCloseSession = "THE BROWSER WAS NOT CLOSE, PLEASE CHECK IF THE ITEM IS AVAILABLE";
        this.scrollMessages = "THE NAVIGATOR SCROLL HAS BEEN LOWER";
        this.timeSleepWait = "THE ITEM COULD NOT BE FOUND, PLEASE TRY AGAIN";
    }

    public String getMessagesText(){
        return this.messagesText;
    }
    public String getMessagesUser() {
        return messagesUser;
    }

    public String getMessagesPass() {
        return messagesPass;
    }

    public String getMessagesButton(){
        return messagesButton;
    }

    public String getMessagesCamp() {
        return messagesCamp;
    }

    public String getMessagesCloseSession() {
        return messagesCloseSession;
    }

    public String getScrollMessages(){
        return this.scrollMessages;
    }

    public String getTimeSleepWait(){
        return this.timeSleepWait;
    }
}