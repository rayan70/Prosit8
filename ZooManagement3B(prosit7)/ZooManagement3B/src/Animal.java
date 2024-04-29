public    class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
public Animal(){}
    public Animal(String family,String name,int age,boolean isMammal)
    throws InvalidAgeException{
        this.family=family;
        this.name=name;
        if(age>0){
            this.age=age;
        }else {
            throw new InvalidAgeException("l'age doit etre positif");
        }

        this.isMammal=isMammal;
    }


    @Override
    public String toString(){
    return "Family : "+family+"\n"+"Name : "+name+"\n"+
            "Age : "+age+"\n"+"isMammal :"+isMammal;
    }

}
