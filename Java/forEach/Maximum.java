class Student{
    String name;
    int rollno;
    int marks;
}
public class Maximum

{

    public static void main(String[] args)  
    {
        Student s1 = new Student();
        s1.name = "Harshit";
        s1.rollno = 1;
        s1.marks = 88;

        Student s2= new Student();
        s2.name = "Motu";
        s2.rollno = 2;
        s2.marks = 89;

        Student s3 = new Student();
        s3.name = "Putuk";
        s3.rollno = 3;
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student stud : students){
            System.out.println(stud.name + " " + stud.rollno + " " + stud.marks);
        }
    }
}