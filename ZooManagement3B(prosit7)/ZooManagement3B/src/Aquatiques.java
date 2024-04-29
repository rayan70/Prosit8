public abstract class Aquatiques extends Animal implements Carnivore<Food> {
    @Override
    public void eatMeat(Food meat) {
    }
    String habitat;
    public Aquatiques(String family,String name,int age,boolean isMammel,String habitat) throws InvalidAgeException {
        super(family,name,age,isMammel);
        this.habitat=habitat;
    }

    public Aquatiques(){}
    @Override
    public String toString(){
        return  super.toString() +"\n"+"Habitat :"+this.habitat;
    }

    public abstract void swim();
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Aquatiques){
           return this.name.equals(((Aquatiques)obj).name) &&
                    this.age== ((Aquatiques)obj).age &&
                    ((Aquatiques)obj).habitat.equals(this.habitat);
        }
        return false;

    }
}
