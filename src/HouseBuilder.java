public abstract class HouseBuilder {
    private int windows;
    private int doors;
    private int rooms;
    private String typeGarage;
    private String typePool;
    private String typeGarden;

    public House build() {
        if (typeGarage != null) {
            if (rooms < 2) {
                rooms = 2;
            }
        }

        return new House(this);
    }

    public String getTypeGarden() {
        return typeGarden;
    }

    public HouseBuilder setTypeGarden(String typeGarden) {
        this.typeGarden = typeGarden;
        return this;
    }

    public String getTypePool() {
        return typePool;
    }

    public HouseBuilder setTypePool(String typePool) {
        this.typePool = typePool;
        return this;
    }

    public String getTypeGarage() {
        return typeGarage;
    }

    public HouseBuilder setTypeGarage(String typeGarage) {
        this.typeGarage = typeGarage;
        return this;
    }

    public int getRooms() {
        return rooms;
    }

    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public int getDoors() {
        return doors;
    }

    public HouseBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public int getWindows() {
        return windows;
    }

    public HouseBuilder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    // public abstract HouseBuilder buildDoors(int doors);

    // public abstract HouseBuilder buildWindows(int windows);

    // public abstract HouseBuilder buildRooms(int rooms);

    // public abstract HouseBuilder buildGarage(String garage);

    // public abstract HouseBuilder buildPool(String pool);

    // public abstract HouseBuilder buildGarden(String garden);
}