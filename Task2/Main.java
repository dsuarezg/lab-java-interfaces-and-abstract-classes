package Task2;

public class Main {

    public static void main(String[] args) {
        var sedan = new Sedan("VH1564165165", "Audi", "A4", 10000);
        var utilityVehicle = new UtilityVehicle("VH1564174512", "Audi", "Q7", 12500, true);
        var truck = new Truck("VH1564154716", "Iveco", "1000", 120500, 15000.24);

        sedan.getInfo();
        utilityVehicle.getInfo();
        truck.getInfo();

    }
}
