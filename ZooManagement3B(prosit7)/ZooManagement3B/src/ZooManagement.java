public class ZooManagement {
    public static void main(String[] args) {

       Zoo myZoo = new Zoo();
       myZoo.name ="myZoo";
       myZoo.city="Tunis";

        try {
            Animal a = new Animal("","",-3,true);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());;
        }
        try {
            Animal b = new Animal("","",3,true);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            Animal c = new Animal("","",-4,true);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


        //  myZoo.displayZoo();
        Zoo m = new Zoo();
        Zoo m2= new Zoo();
        //System.out.println(myZoo);

       // System.out.println(a2.toString());

        //System.out.println(lion.toString());
        //System.out.println(lion);

        System.out.println("nbAnimal : "+myZoo.nbanimal);
       // System.out.println(myZoo);
        //System.out.println(myZoo.searchAnimal(a11));
   // myZoo.removeAnimal(a2);
       // System.out.println("nbAnimal : "+myZoo.nbanimal);
         //System.out.println(myZoo);

        System.out.println(Zoo.nbrAnimalTotal);
        System.out.println(Zoo.comparerZoo(m,myZoo));
        myZoo.comparer(m);
        System.out.println("---------Prosit 5 -----------");


        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        penguin.swimmingDepth=5;
        Penguin penguin1 = new Penguin();
        penguin1.swimmingDepth=10;
        Penguin penguin2 = new Penguin();
        penguin2.swimmingDepth=4;


Aquatiques[] aquatiques =new Aquatiques[2];
aquatiques[0] = penguin1;
Penguin[] penguins = new Penguin[2];

//penguins[0] = (Penguin) new Animal();

        dolphin.swim();
        penguin.swim();

       // myZoo.addAnimal(penguin);
        System.out.println("Les exceptions --------------------");
        try {
            myZoo.addAnimal(penguin);
            myZoo.addAnimal(dolphin);
            myZoo.addAnimal(penguin1);
            myZoo.addAnimal(penguin2);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());;
        }

        penguin1.name="penguin1";
        penguin1.age=5;
        penguin1.habitat="sud";
        penguin2.name="penguin1";
        penguin1.age=2;
        penguin1.habitat="sud2";
        System.out.println("equals");
        System.out.println(penguin1.equals(penguin1));
       // System.out.println(myZoo.nbanimalaqu);
        System.out.println( myZoo.maxPenguinSwimmingDepth());;

    }
}

