package technology;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String brand, int screenSize, int storageSize, int batteryLevel) {
        super(brand, screenSize, storageSize);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void batteryStatus() {
        if(this.batteryLevel >= 80) {
            System.out.println("Ready to work!");
        } else {
            System.out.println("You should charge the laptop!");
        }
    }
}
