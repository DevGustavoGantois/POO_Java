package src.POO;

public class GustavoComputer {
    public static void main(String[] args) {
    InstantMessagingSystem ims = null;

    /*
    Não se sabe qual o app
    mas qualquer um deverá enviar e receber uma mensagem.
    * */

        String ChooseApp = "???";

        if(ChooseApp.equals("msn")) {
            ims = new MSNMessenger();
        } else if (ChooseApp.equals("fbm")) {
            ims = new FacebookMessenger();
        } else {
            ims = new TelegramMessenger();
        }

        ims.sendMessage();
        ims.receivingMessage();
    }
}
