public class StoneHouseBuilder extends HouseBuilder {
    public HouseBuilder buildDoors(int doors) {
        house.setDoors(doors);
        System.out.println("Building stone doors.");
        return this;

    }

    public HouseBuilder buildWindows(int windows) {
        house.setWindows(windows);
        System.out.println("Building stone windows.");
        return this;
    }

    public HouseBuilder buildRooms(int rooms) {
        house.setRooms(rooms);
        System.out.println("Building stone rooms.");
        return this;
    }

    public HouseBuilder buildGarage(String garage) {
        System.out.println("Cannot build garage in stone house.");
        return this;
    }

    public HouseBuilder buildPool(String pool) {
        System.out.println("Cannot build garage in stone house.");
        return this;
    }

    public HouseBuilder buildGarden(String garden) {
        System.out.println("Cannot build garage in stone house.");
        return this;
    }
}
