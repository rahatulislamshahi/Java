class G1 {
    String s1 = "1956 Porsche";
}

class G2 extends G1 {
    String s2 = "Mercedes-Benz 300SL Gullwing";
}

class G3 extends G2 {
    String s3 = "Ferrari 250 GTO";
}


public class Inheritance_MultiLevel {
    public static void main(String[] args) {

        G3 s4 = new G3();
        System.out.println(s4.s1);
        System.out.println(s4.s2);
        System.out.println(s4.s3);
    }

}




