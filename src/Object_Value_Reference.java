class Car{
    String name;
    int year;
}


public class Object_Value_Reference {
    public static void main(String[] args){
        Car s1 = new Car();

        s1.name = "Toyota";
        s1.year = 2002;

        System.out.println(s1.name);
        System.out.println(s1.year);
    }
}

