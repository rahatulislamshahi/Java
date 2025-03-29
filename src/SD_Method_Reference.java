
class student{
    String name;
    int id;
    int batch;
    char section;

    student(String s,int n,int b,char ss){
        name = s;
        id = n;
        batch = b;
        section = ss;
    }
}

public class SD_Method_Reference {
    public static void main(String[] args) {

        student s1 = new student("shahi",37,61,'A');
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.batch);
        System.out.println(s1.section);

    }
}



