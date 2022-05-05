public class VillaBuilder extends HouseBuilder {
    @Override
    public HouseBuilder setDoors(int doors) {
        super.setDoors(doors);
        System.out.println("VillaBuilder setDoors");
        return this;
    }

    public HouseBuilder setRooms(int rooms) {
        super.setRooms(rooms);
        System.out.println("VillaBuilder setRooms");
        return this;
    }

    public HouseBuilder setWindows(int windows) {
        super.setWindows(windows);
        System.out.println("VillaBuilder setWindows");
        return this;
    }

    public HouseBuilder setTypeGarage(String typeGarage) {
        super.setTypeGarage(typeGarage);
        System.out.println("VillaBuilder setTypeGarage");
        return this;
    }

    public HouseBuilder setTypeGarden(String typeGarden) {
        super.setTypeGarden(typeGarden);
        System.out.println("VillaBuilder setTypeGarden");
        return this;
    }

    public HouseBuilder setTypePool(String typePool) {
        super.setTypePool(typePool);
        System.out.println("VillaBuilder setTypePool");
        return this;
    }
}