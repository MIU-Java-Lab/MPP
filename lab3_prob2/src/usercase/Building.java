package usercase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Building {
    private Double maintenanceCost;
    private List<Apartment> apartments = new ArrayList<>();

    Building(Double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(Double rent) {
        apartments.add(new Apartment(rent));
    }

    public Double calculateBuildingProfit() {
        AtomicReference<Double> sum = new AtomicReference<>(0.0);
        apartments.forEach(apartment -> {
            sum.updateAndGet(v -> v + apartment.getRent());
        });

        return sum.get() - maintenanceCost;
    }
}
