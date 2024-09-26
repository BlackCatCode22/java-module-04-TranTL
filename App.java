package tran.zoo.com;



// Tl 09/26/2024
// App.java
// Driver file for the zoo midterm program.


public class App {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my Zoo Program! \n");

        tran.zoo.com.Animal myAnimal = new tran.zoo.com.Animal();
        myAnimal.setAnimalName("my first animal");
        System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());

        tran.zoo.com.Animal anotherAnimal = new tran.zoo.com.Animal("Zig");
        System.out.println("\n The name of the second animal is: " + anotherAnimal.getAnimalName());

        System.out.print("\n number of animal is: " + tran.zoo.com.Animal.numOfAnimals);

        // Create a hyena with a name
        tran.zoo.com.Hyena aNewHyena = new tran.zoo.com.Hyena("Kamari");

    

















    }
}