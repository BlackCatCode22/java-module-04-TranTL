package tran.zoo.com;
import java.util.Date;

public class Animal {
    // Create a static int that keep track of the number of animals created
    static int numOfAnimals = 0;

    // Create a constructor for our new Animals object
    public Animal() { numOfAnimals++; }

    // Create a constructor that accepts all fields as arguments
    public Animal(String sex, int age, int weight, String animalName,
    String animalID, String animalBirthdate, String animalColor, String animalOrigin                ) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthdate = animalBirthdate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;

        numOfAnimals++;
    }

    // Create all attributes (fields) that we need for our midterm program.
    // Sex will be 'male' or 'female'
    String sex;
    private int age;
    // weight will be in pounds
    private int weight;
    // a unique ID for each animal
    private String animalID;
    // animal names come from a text file called animalNames.txt
    private String animalName;
    // animal birthdate is going to be a string here (in this class)
    private String animalBirthdate;
    // animal color is a String
    private String animalColor;
    // origin will be a string like: "from:  Friguia Park, Tunisia"
    private String animalOrigin;
    // arrival date
    private Date animalArrivalDate;



    // Create getters and setters

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID() {return animalID;}
    public void setAnimalID(String animalID) { this.animalID = animalID;}
    public String getAnimalName() {return animalName;}
    public void setAnimalName(String animalName) { this.animalName = animalName;}

    public Date getAnimalBirthdate() {return animalBirthdate;}
    public void setAnimalBirthdate(Date animalBirthdate) {this.animalBirthdate = animalBirthdate;}

    public String getAnimalColor() {return animalColor;}
    public void setAnimalColor(String animalColor) {this.animalColor = animalColor;}

    public String getAnimalOrigin() {return animalOrigin;}
    public void setGetAnimalOrigin(String animalOrigin) {this.animalOrigin = animalOrigin;}

    public Date getAnimalArrivalDate() {return animalArrivalDate;}
    public void setAnimalArrivalDate(Date animalArrivalDate) {this.animalArrivalDate = animalArrivalDate;}
}


