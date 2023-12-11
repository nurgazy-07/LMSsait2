package servises.serviseImpl;

import models.*;
import servises.StudentService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class StudentServiceImpl implements StudentService {

    @Override
    public Student addNewStudentToGroup(ArrayList<Group> groups,ArrayList<Student> studentsss) {
        Student studentd = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кайсы группага студент кошосуз: ");
        String num = scanner.nextLine();
        for (Group grupalar : groups) {
            if(grupalar.getGroupName().equals(num)){
                Student student = new Student();
                student.setId(UnigId.IK());
                System.out.print("Студенттин атын жазыныз: ");
                student.setStudentFistName(scanner.nextLine());
                System.out.print("Студенттин фамилясын жазыныз: ");
                student.setStudentLastName(scanner.nextLine());
                System.out.print("Логин жазыныз: ");
                student.setEmail(scanner.nextLine());
                System.out.print("Пароль жазыныз(узундугу 3 символдон жогору болушу керек): ");
                student.setPassword(scanner.nextLine());
                System.out.print("Gender: ");
                if(scanner.nextLine().equals("m")){
                    student.setGender(Gen.MALE);
                } else if (scanner.nextLine().equals("f")) {
                    student.setGender(Gen.FEMALE);
                }
                ArrayList<Student> students = grupalar.getStudents();
                students.add(student);
                studentsss.add(student);
                grupalar.setStudents(students);
                studentd = student;

            }
        }return studentd;

    }

    @Override
    public void findStudentByFistName() {
        System.out.println("Cтуденттин атын жазыныз: ");
        String num = new Scanner(System.in).nextLine();
        for (Student student : Database.students) {
            if(student.getStudentFistName().equals(num)){
                System.out.println(student);
            }
        }
    }

    @Override
    public void getAllStudentsByGroupName(ArrayList<Group> groups) {
        System.out.println("Групанын атын жазыныз: ");
        String num = new Scanner(System.in).nextLine();
        for (Group group : groups) {
            if(group.getGroupName().equals(num)){
                System.out.println(Database.students);
            }
        }
    }

    @Override
    public void getAllStudentsLesson(ArrayList<Student> students) {
        System.out.println("Студенттин атын жазыныз");
        String soz = new Scanner(System.in).nextLine();
        for (Student student : students) {
            if(student.getStudentFistName().equals(soz)){
                System.out.println(Database.lessons);
            }
        }
    }

    @Override
    public void deleteStudentByEmail(ArrayList<Student> students) {
        System.out.println("Кимди очуросуз ошол адамдын почтасын жазыныз: ");
        String email = new Scanner(System.in).nextLine();
        for (Student student : students) {
            if(student.getEmail().equals(email)){
                Database.students.remove(student);
            }
        }
    }


//    @Override
//    public Student updateStudent() {
//        System.out.print("Студенттин атын жазыныз: ");
//        String num = new Scanner(System.in).nextLine();
//        for (Student student : Database.students) {
//            if(student.getStudentFistName().equals(num)){
//                System.out.print("Студентке жаны ат жазыныз: ");
//                student.setStudentFistName();
//            }
//        }
//        return null;
//    }

}
