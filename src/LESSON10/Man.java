package LESSON10;


public class Man extends Creature {
    final String  firstName="Ольга";
    private final String lastName ="Малкина";
    private final String color ="Блондинка";
    private float weight = 43.9F;
     Man olga = new Man();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }
}

