package LESSON10;

public class Mouse extends Creature{

    private String color= "Серая мышь";
    private final int waightMouse = 5;
    Mouse myshka = new Mouse();



    public String getColor() {
        return color;
    }

    public int getWaightMouse() {
        return waightMouse;
    }

    @Override
    public void consume(Creature victim) {
        if (victim instanceof Bug) {
            mass=mass+((victim.getMass()/100*consumePercentage));
        }

    }
}