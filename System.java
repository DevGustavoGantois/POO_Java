package src;

public class System {
    public static void main(String[] args) {
        Client gustavo = new Client("Gustavo Gantois");
        gustavo.name = "Gustavo Gantois";
        System.out.println(gustavo.creditLimit);
        gustavo.requestCreditLimit(200.0);
        System.out.println(gustavo.creditLimit);

        gustavo.sale(50.0);

        Client nayra = new Client("Nayra Gantois");
        nayra.name = "Nayra Gantois";
        System.out.println(duda.creditLimit);
        nayra.requestCreditLimit(80.0);
        System.out.println(duda.creditLimit);

        System.out.println("Limit of:" + nayra.name + "is" + nayra.creditLimit);
        System.out.println("Limit of:" + gustavo.name + "is" + gustavo.creditLimit);
    }
}
