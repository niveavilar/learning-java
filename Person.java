import org.w3c.dom.ls.LSOutput;

/* 1. Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor,
and print their name and age.*/
public class Person {
    // attributes
    private String name;
    private int age;

    // constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main (String[] args) {
        Person person1 = new Person ("Nivea", 26);
        Person person2 = new Person ("Olavo", 30);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());

    }
}
