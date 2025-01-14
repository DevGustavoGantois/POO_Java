package src.comparision;

import java.util.Objects;

public class Car {
    //Atributos de mesmo tipo
    String color, mark, model;

    //Construtor
    Car(String color, String mark, String model) {
        this.color = color;
        this.mark = mark;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(mark, car.mark) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, mark, model);
    }
}
