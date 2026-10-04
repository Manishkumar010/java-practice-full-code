import javax.swing.plaf.synth.SynthStyle;

class student {
    int rollno;
    String name;
    int marks;
}

public class enhanchedForloop {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 85;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "Alice";
        s2.marks = 90;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "Bob";
        s3.marks = 78;

        System.out.println("Student Details:" + s1.name + ":" + s1.rollno + ":" + s1.marks);

        // student[] students = {s1, s2, s3};

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i < students.length; i++){
        //     System.out.println("Student Details:" + students[i].name + ":" + students[i].rollno + ":" + students[i].marks);
        // }

        for (student s : students) {
            System.out.println("Student Details:" + s.name + ":" + s.rollno + ":" + s.marks);
        }

    }
}
