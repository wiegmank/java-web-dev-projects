package technology;

public class SmartPhone extends Computer {

    private int numOfG;
    private static int numSelfies = 11;

    public SmartPhone (String brand, int screenSize, int storageSize, int numOfG) {
        super (brand, screenSize, storageSize);
        this.numOfG = numOfG;
    };

    public int getNumOfG() {
        return numOfG;
    };

    public void setNumOfG(int numOfG) {
        this.numOfG = numOfG;
    };

    public void selfieCounter() {
        numSelfies++;
        System.out.println("You just took another selfie with your food - you have taken " + this.numSelfies + " selfies with this phone!");
    };
}
