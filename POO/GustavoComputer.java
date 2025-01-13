package src.POO;

public class GustavoComputer {
    public static void main(String[] args) {
    MSNMessenger msnMessenger = new MSNMessenger();

    msnMessenger.sendMessage();
    msnMessenger.receivingMessage();
    msnMessenger.SaveHistoryMessenger();


    FacebookMessenger facebookMessenger = new FacebookMessenger();
    facebookMessenger.sendMessage();
    facebookMessenger.receivingMessage();

    TelegramMessenger telegramMessenger = new TelegramMessenger();
    telegramMessenger.sendMessage();
    telegramMessenger.receivingMessage();
    }
}
