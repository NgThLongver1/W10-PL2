package Java10.JavaQ2;

public class Dog implements Speaker {
    public void speak() {
        System.out.println("Woof Woof!");
    }

    public void announce(String str) {

        System.out.println("Sorry but dog can't say!");
    }
    public void salary() {
        System.out.println("Dog has no salary!");
    }
}
