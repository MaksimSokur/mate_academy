package com.company.MateAcademy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        class Student {
            String firstName;
            String lastName;
            int age;
            boolean isEmployed;
        }
        Student student1 = new Student();
        student1.firstName="Anna"; student1.lastName="Kyts"; student1.age=22; student1.isEmployed=true;
        Student student2 = new Student();
        student2.firstName="Victor"; student2.lastName="Shvets"; student2.age=45; student2.isEmployed=false;
        Student student3 = new Student();
        student3.firstName="Vasil"; student3.lastName="Koval"; student3.age=29; student3.isEmployed=false;
        Student student4 = new Student();
        student4.firstName ="Stas"; student4.lastName="Litvin"; student4.age=41; student4.isEmployed=true;
        Student student5 = new Student();
        student5.firstName="Alina"; student5.lastName="Ivanova"; student5.age=33; student5.isEmployed=true;
        Student student6 = new Student();
        student6.firstName="Ivan"; student6.lastName="Petrov"; student6.age=31; student6.isEmployed=false;
        Student student7 = new Student();
        student7.firstName="Irina"; student7.lastName="Stetsenko"; student7.age=30; student7.isEmployed=true;
        Student student8 = new Student();
        student8.firstName="Yurii"; student8.lastName="Shvets"; student8.age=40; student8.isEmployed=false;
        Student student9 = new Student();
        student9.firstName="Olha"; student9.lastName="Kulyk"; student9.age=37; student9.isEmployed=true;

        Student [] studentsInfo = new Student[]{student1,student2,student3,student4,student5,
                student6,student7,student8,student9};
        float x = 0;
        float yes = 0;
        float no = 0;
        for (Student student : studentsInfo){
            if (student.age >= 30 && student.age <= 40 && student.isEmployed){
                ++yes;
            }else if (student.age >= 30 && student.age <= 40 && student.isEmployed == false){
                ++no;}
        }
        x = yes + no;
        System.out.println(yes/x);
    }
}
