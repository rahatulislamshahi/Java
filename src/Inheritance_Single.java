
class Father{
    String n = "100k";
    String s = "Home";
        }

 class Son extends Father{

}

public class Inheritance_Single {
    public static void main(String[] args){
        Son s1 = new Son();
        System.out.println(s1.n);
        System.out.print(s1.s);
    }
}
