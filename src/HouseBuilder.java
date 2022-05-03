public abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }

    public void createHouse() {
        house = new House();
    }

    public HouseBuilder buildDoors(int doors) {
        house.setDoors(doors);
        return this;
    }

    public abstract HouseBuilder buildWindows(int windows);

    public abstract HouseBuilder buildRooms(int rooms);

    public abstract HouseBuilder buildGarage(String hasGarage);

    public abstract HouseBuilder buildPool(String hasPool);

    public abstract HouseBuilder buildGarden(String hasGarden);
}
