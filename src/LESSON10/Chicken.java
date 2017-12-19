package LESSON10;


public class Chicken extends Creature {

    private String Type= "Курица";
    private final int eatFoodQuantity = 3;
    Chicken kuritsa = new Chicken();


    public String getType() {
        return Type;
    }

    public int getEatFoodQuantity() {
        return eatFoodQuantity;
    }

    @Override
    public void consume(Creature victim) {
        if (victim instanceof Bug) {
            mass=mass+((victim.getMass()/100*consumePercentage));
        }

    }

}

