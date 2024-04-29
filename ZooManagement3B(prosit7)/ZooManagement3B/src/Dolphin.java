public final class  Dolphin extends Aquatiques{
    float swimmingSpeed;
    public Dolphin(String family,String name,int age
            ,boolean isMammel,String habitat,float swimmingSpeed) throws InvalidAgeException {
        super(family,name,age,isMammel,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    @Override
    public void swim(){
        System.out.println("This Dolphin animal is swimming");
    }
    public Dolphin(){}
}
