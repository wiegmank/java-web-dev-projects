package org.launchcode;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("de");
        System.out.println(message);

//        Mouse m = new Mouse();
//        System.out.println(m.weight);
//        m.weight = 55;
//        System.out.println(m.weight);
//        m.squeak();

        System.out.println(StaticMouse.weight);
        StaticMouse.squeak();

    }
}


