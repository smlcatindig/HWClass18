package class18;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    Dog(String name, String color, String breed, int age, double weight) {
      /*  this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age; */
        // calling the constructor from the same class which takes name, color, breed, age as parameter
        this(name, color, breed, age);
        this.weight = weight;

    }

    Dog(String name, String color, String breed, int age) {

      /*  this.name = name;
        this.color = color;
        this.breed = breed; */
        this(name, color, breed);
        this.age = age;

    }

    Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;


    }
}
