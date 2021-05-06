import java.util.ArrayList;
import java.util.List;

public class Car {

    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private List<Dimension> dimensions;

    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, List<Dimension> dimensions) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public static List<Car> getCarsBMW(List<Car> cars, List<Car>carsBMW) {
        if (cars.size() > 0) {
            for (Car c : cars) {
                for (Dimension d : c.getDimensions()) {
                    if (c.isAutomaticGear() &&
                            c.getProducer().getModel().equals("BMW") &&
                            d.getTrankCapacity() > 300) {
                        carsBMW.add(c);
                        for (Country country : c.getMarket().getCountries()) {
                            System.out.println(country.getCountryName() + "-" + country.getCountrySign());
                        }
                    }
                }
            }
        } else {
            System.out.println("The list of cars you are searching is empty");
        }
        return carsBMW;
    }
}
