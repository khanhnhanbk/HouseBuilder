public class App {
    public static void main(String[] args) throws Exception {

        HouseBuilder builder = new VillaBuilder();
        builder.createHouse();

        builder.buildDoors(2)
                .buildGarage("2x6")
                .buildGarden("Master")
                .buildWindows(2)
                .buildRooms(4);
        House house = builder.getHouse();
        System.out.println(house);

        builder = new StoneHouseBuilder();

        builder.createHouse();

        builder.buildDoors(3)
                .buildGarage("2x6")
                .buildGarden("Master")
                .buildWindows(3)
                .buildRooms(5);

        house = builder.getHouse();

        System.out.println(house);

        House house2 = new House(2, 3, 4, "2x6", "pool", "garden");
        System.out.println(house2);
        House house3 = new House(2, 3, 4, null, null, null);
        System.out.println(house3);
    }
}
