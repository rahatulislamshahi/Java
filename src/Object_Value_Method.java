
class anime{
    String name;

    public void show(){
        System.out.println(name);
    }
}
public class Object_Value_Method {
    public static void main(String[] args) {
        anime a1 = new anime();
        a1.name = "Demon Slayer";
        a1.show();
    }
}