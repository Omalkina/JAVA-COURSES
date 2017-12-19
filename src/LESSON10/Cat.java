package LESSON10;

public class Cat extends Creature{
    final String Name ="Тони";
    final String sex ="Мальчик: кот";
    private String color= "Черепаховый окрас";
    private final int waightCat = 18;
    Cat kot = new Cat();



    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    public int getWaightCat() {
        return waightCat;
    }
    @Override
    public void consume(Creature victim) {
        if (victim instanceof Bug) {
            mass=mass+((victim.getMass()/100*consumePercentage));
        }

    }
}