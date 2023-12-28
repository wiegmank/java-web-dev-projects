package technology;

public class Program {

    public static void main(String[] args) {

        Computer myComputer = new Computer("mac", 13, 256);
        myComputer.computerInfo("mac", 13, 256);
        myComputer.gamingOrWorking();

        Laptop myLaptop = new Laptop("mac", 13, 256, 75);
        myLaptop.batteryStatus();

        SmartPhone myPhone = new SmartPhone("iphone", 6, 128, 5);
        myPhone.selfieCounter();


    }
}
