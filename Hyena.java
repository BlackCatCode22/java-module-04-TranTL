package tran.zoo.com;

public class Hyena extends tran.zoo.com.Animal {
    // Create a static int that keep track of the number of hyenas created
    static int numOfHyenas = 0;

    // Create a constructor
    public Hyena(String someName) {
        super(someName);
        numOfHyenas++;
    }
    public static int getNumOfHyenas() {
        return numOfHyenas;
    }
}
