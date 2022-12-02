import usercase.Apartment;
import usercase.Building;
import usercase.Landlord;

public class Main {
    public static void main(String[] args) {

        System.out.println("**************** Group 11 - Lab # 3 - Problem # 2 ****************");

        Landlord landlord = new Landlord(); // initialize values with according to bear minimum requirement

        Building newBuilding1 = landlord.addBuilding(100.0);
        landlord.addApartment(newBuilding1,200.0);
        landlord.addApartment(newBuilding1, 300.0);

        Building newBuilding2 = landlord.addBuilding(250.0);
        landlord.addApartment(newBuilding2, 400.0);

        Building newBuilding3 = landlord.addBuilding(200.0);

        System.out.println("newBuilding1 Profit is: " + newBuilding1.calculateBuildingProfit() + "$");
        System.out.println("newBuilding2 Profit is: " + newBuilding2.calculateBuildingProfit() + "$");
        System.out.println("newBuilding1 Profit is: " + newBuilding3.calculateBuildingProfit() + "$");

        System.out.println("**************** LANDLORD NET PROFIT ****************");
        System.out.println("Landlord monthly total Profit is: " + landlord.calculateMonthlyNetProfit() + "$");

    }
}