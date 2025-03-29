/*
Key Points:
✔ Single, Multilevel, and Hierarchical inheritance are supported using classes.
✔ Multiple and Hybrid inheritance are implemented using interfaces in Java.
✔Java does not support multiple inheritance with classes to avoid ambiguity issues (Diamond Problem).
*/


class Versity{
    String dept = "Cse";
}
class College extends Versity{

}
class School extends College{

}

public class Inheritance_Hierarchical {
    public static void main(String[] args){

        College s1 = new College();
        School s2 = new School();
        System.out.println(s1.dept);
        System.out.println(s2.dept);

    }
}
