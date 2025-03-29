package Java10.JavaQ2;

public class Teacher implements Speaker {
    public void speak() {
        System.out.println("Hello!");
    }

    public void announce(String str) {

        System.out.println("Teacher says: " + str);
    }
    public void salary() {
        System.out.println("Teacher has a salary of 5000 Euro!");
    }
}
