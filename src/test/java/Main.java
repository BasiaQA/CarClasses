import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //objects of Producer

        Producer toyota1 = new Producer("Toyota", "Corolla");
        Producer toyota2 = new Producer("Toyota", "Camry");
        Producer suzuki1 = new Producer("Suzuki", "Swift");
        Producer suzuki2 = new Producer("Suzuki", "Alto");
        Producer opel = new Producer("Opel", "Corsa");
        Producer bmw1 = new Producer("BMW", "X3");
        Producer bmw2 = new Producer("BMW", "X5");
        Producer bmw3 = new Producer("BMW", "X6");
        Producer bmw4 = new Producer("BMW", "Z8");
        Producer bmw5 = new Producer("BMW", "Z4");

        //objects of Country
        Country countr1 = new Country("Poland", 'P');
        Country countr2 = new Country("Germany", 'G');
        Country countr3 = new Country("China", 'C');
        Country countr4 = new Country("USA", 'U');
        Country countr5 = new Country("France", 'F');

        //objects of Market
        Market market1 = new Market("business", Arrays.asList(countr1, countr2, countr4, countr5));
        Market market2 = new Market("cargo", Arrays.asList(countr1, countr2, countr5));
        Market market3 = new Market("taxi", Arrays.asList(countr1, countr2, countr4));
        Market market4 = new Market("business", Arrays.asList(countr3, countr4, countr5));
        Market market5 = new Market("transport", Arrays.asList(countr1, countr3, countr4));

        //objects of Dimension
        Dimension dimBelow1 = new Dimension(75, 145, 240);
        Dimension dimAbove1 = new Dimension(78, 150, 301);
        Dimension dimBelow2 = new Dimension(70, 134, 290);
        Dimension dimBelow3 = new Dimension(72, 128, 270);
        Dimension dimAbove2 = new Dimension(75, 145, 315);
        Dimension dimBelow4 = new Dimension(73, 145, 235);
        Dimension dimAbove3 = new Dimension(68, 132, 325);
        Dimension dimAbove4 = new Dimension(75, 145, 350);
        Dimension dimBelow5 = new Dimension(79, 145, 230);
        Dimension dimAbove5 = new Dimension(78, 147, 310);

        //List of Cars
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(toyota1, true, market3, "standard", Arrays.asList(dimBelow1, dimBelow5, dimAbove5)));
        cars.add(new Car(toyota1, false, market1, "standard", Arrays.asList(dimBelow1, dimBelow4, dimAbove5)));
        cars.add(new Car(toyota2, true, market3, "standard", Arrays.asList(dimAbove1, dimBelow3, dimBelow5)));
        cars.add(new Car(suzuki1, true, market2, "standard", Arrays.asList(dimAbove2, dimBelow5, dimAbove5)));
        cars.add(new Car(bmw3, true, market3, "premium", Arrays.asList(dimBelow1, dimAbove2, dimAbove5))); //ok - 2TC*3kraje
        cars.add(new Car(opel, true, market5, "medium", Arrays.asList(dimBelow1, dimAbove3, dimAbove5)));
        cars.add(new Car(toyota2, false, market3, "standard", Arrays.asList(dimBelow1, dimBelow5, dimAbove5)));
        cars.add(new Car(suzuki1, false, market4, "standard", Arrays.asList(dimBelow1, dimAbove1, dimBelow2)));
        cars.add(new Car(suzuki2, true, market3, "standard", Arrays.asList(dimBelow1, dimBelow5, dimAbove5)));
        cars.add(new Car(bmw1, false, market4, "premium", Arrays.asList(dimAbove2, dimAbove4, dimAbove5))); //nie
        cars.add(new Car(bmw2, true, market2, "premium", Arrays.asList(dimBelow2, dimBelow5, dimAbove5)));//ok - 1TC*3kraje
        cars.add(new Car(bmw3, true, market3, "premium", Arrays.asList(dimBelow1, dimBelow3, dimBelow5)));//nie
        cars.add(new Car(bmw4, true, market4, "premium", Arrays.asList(dimBelow1, dimBelow5, dimAbove3)));//ok - 1TC*3kraje
        cars.add(new Car(bmw5, true, market5, "premium", Arrays.asList(dimBelow3, dimAbove1, dimBelow5)));//ok - 1TC*3kraje
        cars.add(new Car(bmw1, false, market4, "premium", Arrays.asList(dimAbove2, dimAbove4, dimAbove5)));//nie

        Car.getCarsBMW(cars);
    }
}
