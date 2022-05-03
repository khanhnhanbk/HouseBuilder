public class House {
    private int windows;
    private int doors;
    private int rooms;
    private String typeGarage;
    private String typePool;
    private String typeGarden;

    public int getWindows() {
        return windows;
    }

    public String isHasGarden() {
        return typeGarden;
    }

    public void setHasGarden(String hasGarden) {
        this.typeGarden = hasGarden;
    }

    public String isHasPool() {
        return typePool;
    }

    public void setHasPool(String hasPool) {
        this.typePool = hasPool;
    }

    public String isHasGarage() {
        return typeGarage;
    }

    public void setHasGarage(String hasGarage) {
        this.typeGarage = hasGarage;
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

    // toString() method
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasGarage=" + typeGarage +
                ", hasPool=" + typePool +
                ", hasGarden=" + typeGarden +
                '}';
    }
}
