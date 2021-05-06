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

    public static void getCarsBMW(List<Car> cars) {
        int count = 0;
        for (Car c : cars) {
            if (c.isAutomaticGear()) {
                if (c.getProducer().getModel().equals("BMW")) {
                    for (Dimension d : c.getDimensions()) {
                        if (d.getTrankCapacity() > 300) {
                            for (Country country : c.getMarket().getCountries()) {
                                count++;
                                System.out.println(count + ". Car - " +
                                        "Producer: " + c.getProducer().getModel() +
                                        ". TankCapacity: " + d.getTrankCapacity() +
                                        ". Country: " + country.getCountryName() + "-" + country.getCountrySign());
                            }
                        }
                    }
                }
            }
        }
    }
}
