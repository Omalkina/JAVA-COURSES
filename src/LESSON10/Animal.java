package LESSON10;


    public class Animal extends Creature {

    private String TypeOfAnimal = "Курица";
    private final int eatFoodQuantity = 22;
     Animal predator = new Animal();



        public String getTitle() {
            return title;
        }

        public String getTypeOfAnimal() {
            return TypeOfAnimal;
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

