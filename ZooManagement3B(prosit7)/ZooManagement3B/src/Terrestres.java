public class Terrestres extends Animal implements Omnivore<Food>{
    @Override
    public void eatMeat(Food meat) {

    }

    @Override
    public void eatPlant(Food plant) {

    }

    @Override
    public void eatPlantAndMeat(Food food) {

    }

    int nbLegs;
    public Terrestres(String family,String name,int age,boolean isMammel,int nbLegs) throws InvalidAgeException {
        super(family,name,age,isMammel);
        this.nbLegs=nbLegs;
    }
}
