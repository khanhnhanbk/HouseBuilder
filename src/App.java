public class App {
    public static void main(String[] args) throws Exception {

        HouseBuilder builder = new VillaBuilder();

        House house = builder.setDoors(2)
                .setRooms(1)
                .setWindows(2)
                .setTypeGarage("ssss")
                .build();
        System.out.println(house);

    }
}
