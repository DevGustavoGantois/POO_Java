package src.comparision;

public class CarFactory {
    public static void main(String[] args) {
        Car car1 = new Car("white", "fiat", "palio");
        Car car2 = new Car("white", "fiat", "palio");
        Car car3 = new Car("white", "fiat", "palio");
        Car car4 = new Car("white", "fiat", "palio");
        Car car5 = new Car("white", "fiat", "palio");

        Car car6 = car1;

        //case 01
        System.out.println(car1 == car2); //false
        //case 02
        System.out.println(car1.equals(car2)); //false
    }
}

//Quando usamos o == estamos comparando referências de objeto.
//Todos os carros por mais que sejam de instâncias diferentes, eles são iguais. Não quer dizer que sejam os mesmos objetos.