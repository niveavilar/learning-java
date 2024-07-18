/* 2. Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and
modify the attributes using the setter methods and print the updated values. */
public class Dog {
    private String name;
    private String breed;

    // constructors
    public Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public static void main (String[] args) {
        Dog zeca = new Dog ("Zeca", "Maltese");
        Dog kobe = new Dog ("Kobe", "Yorkshire");

        System.out.println(zeca.getName());
        System.out.println(kobe.getName());
        zeca.setName("Zequinha");
        System.out.println(zeca.getName());
    }

}

