package studying.java.javacore.introduction.classes.test;

import studying.java.javacore.introduction.classes.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Israel";
        student.age = 18;
        student.sex = 'M';
        
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
