package LESSON10;

    public class Dog extends Creature{

        final String poroda ="Лабрадор";
        private String color= "Рыжая в крапинку";
        private final int waightDog = 18;
        Dog sobaka = new Dog();


        public String getPoroda() {
            return poroda;
        }

        public String getColor() {
            return color;
        }

        public int getWaightDog() {
            return waightDog;
        }
    }
