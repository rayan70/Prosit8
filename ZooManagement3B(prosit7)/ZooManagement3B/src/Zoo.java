public class Zoo {
    Animal[] animals;
    Aquatiques[] aquaticAnimals;
    String name,city;
   public static final int  nbCages =3;
    int nbanimal,nbanimalaqu ;
   static int nbrAnimalTotal;

    public Zoo(){

        animals=new Animal[nbCages];
        aquaticAnimals = new Aquatiques[10];
    }
    public Zoo(String name,String city){
        this.name=name;
        this.city=city;
        animals= new Animal[nbCages];
    }
    public void displayZoo(){
        System.out.println("Name : "+name);
        System.out.println("City : "+city);
        System.out.println("NbCages : "+nbCages);
    }
   @Override
    public String toString(){
        String s ="Name : "+name+"\n"+"City : "+city+"\n"+"NbCages : "
                +nbCages;
        String r="";
        for(int i=0;i<nbanimal;i++){
          r+=  animals[i];
        }
        return s+r;
    }

    public void addAnimal(Animal animal) throws ZooFullException{
       if(nbanimal<nbCages){
           animals[nbanimal]=animal;
           nbanimal++;
           nbrAnimalTotal++;

       }else {
           throw new ZooFullException("le zoo est plein !!!!");
       }
    }
    public int searchAnimal(Animal animal){
        for(int i=0;i<nbanimal;i++){
            if(animals[i].name==animal.name){
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal (Animal animal){
        int x = this.searchAnimal(animal);
        if (x!=-1)
        {
            for (int i=x ;i<nbanimal-1;i++)
            {
                animals[i]=animals[i+1];

            }
            animals[nbanimal]=null;
            nbanimal--;
            nbrAnimalTotal--;
            return true ;
        }
        return false ;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbanimal>z2.nbanimal){
            return z1;
        }else{
           return z2;
        }
    }
    public Zoo comparer(Zoo z1){
        if(z1.nbanimal>nbanimal){
            return z1;
        }else{
            return this;
        }
    }
    public void addAquaticAnimal(Aquatiques aquatic){
        if(nbanimalaqu<10) {
            aquaticAnimals[nbanimalaqu] = aquatic;
            nbanimalaqu++;
        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxSwimm=0;
        for(int i=0;i<nbanimalaqu;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                 if (((Penguin) aquaticAnimals[i]).swimmingDepth>maxSwimm){
                     maxSwimm = ((Penguin) aquaticAnimals[i]).swimmingDepth;
                 }
            }

        }
        return maxSwimm;
    }
}
