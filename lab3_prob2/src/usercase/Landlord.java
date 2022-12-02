package usercase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Landlord {
    private final List<Building> buildings = new ArrayList<>();

    public Landlord() {}

    public Building addBuilding(Double maintenanceCost) {
        Building building = new Building(maintenanceCost);
        buildings.add(building);
        return building;
    }

    public void addApartment(Building building, Double rent) {
        if(building != null) building.addApartment(rent);
    }

    public Double calculateMonthlyNetProfit(){
        AtomicReference<Double> totalProfit = new AtomicReference<>(0.0);
        buildings.forEach(building -> {
            totalProfit.updateAndGet(v -> v + building.calculateBuildingProfit());
        });

        return totalProfit.get();
    }
}
