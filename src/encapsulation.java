class person{
    private String name;


    /*This is a setter method that allows modifying the name variable.
    The this.name refers to the instance variable,
    while NewName is the method parameter.*/

    public void setName(String NewName){
        this.name = NewName;
    }

   // This is a getter method that allows reading the name variable.
    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args){
        person p1 = new person();
        p1.setName("Shahi");
        System.out.println(p1.getName());

    }
}
