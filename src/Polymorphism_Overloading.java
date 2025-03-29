class math{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(double a,double b) {
        return a + b;
    }
}


public class Polymorphism_Overloading {
public static void main(String[] args){

    math m = new math();

    System.out.println(m.add(6,5,4));
    System.out.println(m.add(5,5));
    System.out.println(m.add(5.5,5.5));

}

}
