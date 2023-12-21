package technology;

public class Computer {

    private String brand;
    private int screenSize;
    private int storageSize;

    public Computer(String brand, int screenSize, int storageSize) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.storageSize = storageSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public void computerInfo(String brand, int screenSize, int storageSize) {
        System.out.println("*** Computer ***\n" + "Brand : " + this.brand +"\nScreen size : " + this.screenSize + "\nStorage size : " + this.storageSize);
    }

    public void gamingOrWorking() {
        boolean onlyGaming = true;
        if(onlyGaming) {
            System.out.println("No work, only play!");
        }
    }

}
