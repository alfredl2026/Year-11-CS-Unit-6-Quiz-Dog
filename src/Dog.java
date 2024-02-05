public class Dog {
    private int age;
    private String name;
    private String color;
    private Owner owner;
    public Dog(int age, String name, String color, Owner owner){
        this.age = age;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public Owner getOwner(){
        return this.owner;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    private void addOneAge(){
        this.age++;
    }
    public int birthday(){
        this.addOneAge();
        return this.age;
    }
    public String toString(){
        return("The dog is named " + this.name + " and is " + this.age + " years old. This dog is " + this.color + ".");
    }
}
