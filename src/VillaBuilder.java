public class VillaBuilder extends HouseBuilder {

    public HouseBuilder buildDoors(int doors) {
        house.setDoors(doors);
        System.out.println("Building villa doors.");
        return this;

    }

    public HouseBuilder buildWindows(int windows) {
        house.setWindows(windows);
        System.out.println("Building villa windows.");
        return this;
    }

    public HouseBuilder buildRooms(int rooms) {
        house.setRooms(rooms);
        System.out.println("Building villa rooms.");
        return this;
    }

    public HouseBuilder buildGarage(String garage) {
        house.setTypeGarage(garage);
        System.out.println("Building villa garage.");
        return this;
    }

    public HouseBuilder buildPool(String pool) {
        house.setTypePool(pool);
        System.out.println("Building villa pool.");
        return this;
    }

    public HouseBuilder buildGarden(String garden) {
        house.setTypeGarden(garden);
        System.out.println("Building villa garden.");
        return this;
    }

}