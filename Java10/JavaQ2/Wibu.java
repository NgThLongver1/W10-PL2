package Java10.JavaQ2;

public class Wibu implements Speaker {
    public void speak() {
        System.out.println("Woof Woof!");
    }

    public void announce(String str) {

        System.out.println("Wibu says: " + str);
    }
    public void salary() {
        System.out.println("Wibu not only do not have any salary but also live off of his family!");
    }
}