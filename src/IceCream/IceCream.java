package IceCream;

public class IceCream {

    private String flavors;
    private int numSprinkles;

    public IceCream(String flavors, int numSprinkles) {  // consractur açtık
        this.flavors = flavors;
        this.numSprinkles = numSprinkles;
    }

    public int getValue() {   // metod açacaz ve metodumzun ismi getValue olsun
        int sweetnessValue = 0;
        switch (this.flavors) {
            case "Plain":
                sweetnessValue = 0;
                break;
            case "Vanilla":
            case "ChocolateChip":
                sweetnessValue = 5;
                break;
            case "Strawberry":
            case "Chocolate":
                sweetnessValue = 10;
                break;
        }
        return sweetnessValue + this.numSprinkles;
    }

    public String getFlavors() {

        return flavors;
    }

    public int getNumSprinkles() {

        return numSprinkles;
    }

}
