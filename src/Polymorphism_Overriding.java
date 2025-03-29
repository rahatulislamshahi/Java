class Mobile
{
    void system()
    {
        System.out.println("IPHONE BEST");
    }
}

class Phone extends Mobile{

    void system()
    {
        System.out.println("Android BEST");
    }
}

public class Polymorphism_Overriding {

    public static void main(String[] args){
        Phone p = new Phone();
        p.system();
    }
}
