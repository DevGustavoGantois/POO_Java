package src;

public class Client {
    String name;
    Double creditLimit = 100.0;
    public void requestCreditLimit(Double requestValue) {
        creditLimit = requestValue;
    }

    public void sale(Double productValue) {
        creditLimit = creditLimit - productValue;
    }

    public Client(String nameAccept) {
        name = nameAccept;

    }

}
