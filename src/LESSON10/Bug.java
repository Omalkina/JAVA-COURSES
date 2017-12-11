package LESSON10;

public class Bug extends Creature{

    private String bugName = "Таракан";
    private String typeBug= "Мадагаскарский";
    private final float waightBug = 0.1F;

    Bug zhuk = new Bug();



    public String getBugName() {
        return bugName;
    }

    public String getTypeBug() {
        return typeBug;
    }

    public float getWaightBug() {
        return waightBug;
    }

}