class Student1 {
    String name;
    int age;
    String section;


    Student1() {
    }


    void details(String x, int y, String z) {
        this.name = x;
        this.age = y;
        this.section = z;
    }


    void showDetails() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.section);
    }
}

public class SD_Class_Method_This_Keyword {
    public static void main(String[] args) {
        // Create an object of Student1
        Student1 s1 = new Student1();
        s1.details("Shahi", 24, "A");
        s1.showDetails();
    }
}
