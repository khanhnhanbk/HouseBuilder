public class VillaBuilder extends HouseBuilder {
    public VillaBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder buildDoors(int doors) {
        house.setDoors(doors);
        System.out.println("Villa Door");
        return this;
    }

    @Override
    public HouseBuilder buildWindows(int windows) {
        house.setWindows(windows);
        System.out.println("VillaBuilder: buildWindows()");
        return this;
    }

    @Override
    public HouseBuilder buildRooms(int rooms) {
        house.setRooms(rooms);
        System.out.println("VillaBuilder: buildRooms()");
        return this;
    }

    @Override
    public HouseBuilder buildGarage(String hasGarage) {
        house.setHasGarage(hasGarage);
        System.out.println("VillaBuilder: buildHasGarage()");
        return this;
    }

    @Override
    public HouseBuilder buildPool(String hasPool) {
        house.setHasPool(hasPool);
        System.out.println("VillaBuilder: buildHasPool()");
        return this;
    }

    @Override
    public HouseBuilder buildGarden(String hasGarden) {
        house.setHasGarden(hasGarden);
        System.out.println("VillaBuilder: buildHasGarden()");
        return this;
    }

}
