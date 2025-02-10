package src;

public class Arrays {
    public static void main(String[] args) {
        Integer [] array = new Integer[6]; //Podemos fazer uma abreviação, porém temos que ter os valores fixos
        array[0] = 2;
        array[1] = 4;
        array[2] = 10;
        array[3] = 15;
        array[4] = 5;
        array[5] = 3;
        System.out.println("el.:" + array[3]);
        for (int i = 0; i < array.length; i++) {
            Integer element = array[i];
            System.out.println(element);
        }
    }
}
