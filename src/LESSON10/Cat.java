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
}