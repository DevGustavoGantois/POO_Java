package src.POO;

public class InstantMessagingSystem {
    public void sendMessage() {
        if(connectingTheInternet() == true) {
            System.out.println("Send message.");
        }
        else {
            System.out.println("Computer offline.");
        }
    }

    public void receivingMessage() {
        System.out.println("Receiving Message.");
    }

    private void connectingTheInternet() {
        System.out.println("Checking if wifi is connected to send message.");
        return true;
    }

    public void SaveHistoryMessenger() {
        System.out.println("Saving the message in the history.");
    }
}
