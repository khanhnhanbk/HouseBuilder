public class House {
    private int windows;
    private int doors;
    private int rooms;
    private String typeGarage;
    private String typePool;
    private String typeGarden;

    public House(HouseBuilder builder) {
        this.windows = builder.getWindows();
        this.doors = builder.getDoors();
        this.rooms = builder.getRooms();
        this.typeGarage = builder.getTypeGarage();
        this.typePool = builder.getTypePool();
        this.typeGarden = builder.getTypeGarden();
    }

    public House(int windows, int doors, int rooms, String typeGarage, String typePool, String typeGarden) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.typeGarage = typeGarage;
        this.typePool = typePool;
        this.typeGarden = typeGarden;
    }

    public House(int windows, int doors, int rooms) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
    }

    public House(int windows, int doors, int rooms, String typeGarage) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.typeGarage = typeGarage;
    }

    public House() {
    }

    public int getWindows() {
        return windows;
    }

    public String getTypeGarden() {
        return typeGarden;
    }

    public void setTypeGarden(String typeGarden) {
        this.typeGarden = typeGarden;
    }

    public String getTypePool() {
        return typePool;
    }

    public void setTypePool(String typePool) {
        this.typePool = typePool;
    }

    public String getTypeGarage() {
        return typeGarage;
    }

    public void setTypeGarage(String typeGarage) {
        this.typeGarage = typeGarage;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "House [windows=" + windows + ", doors=" + doors + ", rooms=" + rooms + ", typeGarage=" + typeGarage
                + ", typePool=" + typePool + ", typeGarden=" + typeGarden + "]";
    }
}
