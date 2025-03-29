// Firm.java
package Java10.JavaQ2;

public class Driver {
    public static void main(String[] args) {
        Speaker dog = new Dog();
        dog.speak();
        dog.announce("Hello! I am a dog.");
        dog.salary();
        Speaker teacher = new Teacher();
        teacher.speak();        
        teacher.announce("Don't forget to do your homework!");
        teacher.salary();
        Speaker Wibu = new Wibu();
        Wibu.speak();
        Wibu.announce("I am a Wibu!");  
        Wibu.salary();
    }
}