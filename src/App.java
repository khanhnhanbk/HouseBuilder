public class App {
    public static void main(String[] args) throws Exception {

        HouseBuilder builder = new VillaBuilder();

        builder.createHouse();
        builder.buildDoors(2)
                .buildGarage("yes")
                .buildGarden("yes")
                .buildPool("yes")
                .buildWindows(2)
                .buildRooms(4);
        House house = builder.getHouse();
        System.out.println(house);
    }
}
