public abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }

    public HouseBuilder createHouse() {
        house = new House();
        return this;
    }

    public abstract HouseBuilder buildDoors(int doors);

    public abstract HouseBuilder buildWindows(int windows);

    public abstract HouseBuilder buildRooms(int rooms);

    public abstract HouseBuilder buildGarage(String garage);

    public abstract HouseBuilder buildPool(String pool);

    public abstract HouseBuilder buildGarden(String garden);
}