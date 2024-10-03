// TL 10/3/2024
// zooVersion1.java
//

package tran.zoo.com;


public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the dates and Animal Class!");

        // Create a Date object to represent the current date
        Date today = new Date();

        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        // Output the result
        System.out.print("Today's date in the format yyyy-MM-dd: " + strTodaysDate);

        // Calculate birthdates for the following two hyenas
        // 1) 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to find birthdates for the animal and then create a method that returns a string
        // for the animal's birthdate.

        // input: "4 years old female hyena, born in Spring"
        // processing: find the age and birth season
        //             and then use decision control structures to
        //             calculate the date.

        // Parse the string first
        String strStarting = "12 year old male hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia";
        // split the string
        System.out.println();
        String[] arrayOfStrPartsOnComma = strStarting.split(",");
        // output the array element
        // this is for: each loop - very handy when examining array elements.
        int elementNum = 0;
        for (String thePart: arrayOfStrPartsOnComma) {
            System.out.println(" Element " + elementNum + " of the string is: " + thePart);
            elementNum++;
        }
        System.out.println();


        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        elementNum = 0;
        for (String thePart: arrayOfStrPartsOnSpace) {
            System.out.println(" Element " + elementNum + " of the string 01 is: " + thePart);
        }
        System.out.println();


        String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
        elementNum = 0;
        for (String thePart: arrayOfStrPartsOnSpace02) {
            System.out.println(" Element " + elementNum + " of the string 02 is: " + thePart);
            elementNum++;
        }
        System.out.println();


        String ageInYears = arrayOfStrPartsOnSpace[0];
        String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);

        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);

        switch (season) {
            case "spring":
            animalBirthdate = Integer.toString(animalBirthYear) + "03-21";
            break;
            animalBirthdate = Integer.toString(animalBirthYear) + "06-21";
            break;

        case (animalBirthSeason.contains("fall")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "09-21";
            break;
        }

        case (animalBirthSeason.contains("winter")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "12-21";
            break;
        }


        System.out.println("\n animalBirthdate = " + animalBirthdate);


            // this is a unit test - we are testing the Animal constructor we just created
        tran.zoo.com.Animal myNewAnimal = new tran.zoo.com.Animal("male", 4, 70, "Zig", "Hy01", "2020-3-21", "brown spot", "from San Diego Zoo");

        // Prove it
        System.out.println("\n this is the new animal! \n");
        System.out.println("\n ID is: " + myNewAnimal.getAnimalID() + " and...name is: " + myNewAnimal.getAnimalName() + "\n");


















    }
}