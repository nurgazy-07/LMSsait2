import models.Database;
import models.Group;
import models.Student;
import servises.serviseImpl.GroupServiseImpl;
import servises.serviseImpl.StudentServiceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        GroupServiseImpl groupServise = new GroupServiseImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кутман кеч! Саат ->  "+ LocalDateTime.now());
        System.out.println("""
                Катталган болсонуз 1 басыныз, пароль унутуп калып, озгортуу учун 2 басыныз.
                """);
        if(scanner.nextLine().equals("1")){
             while (true){
                 System.out.println("""
                         *** Бир команда танданыз ***
                         1 -> Add new Group
                         2 -> Get group by Name
                         3 -> Update group Name
                         4 -> Get All groups
                         5 -> Add Student to Group
                         6 -> Update Student
                         7 -> Find Student by Fist name
                         8 -> Get All students by Group name
                         9 -> Get All student's lesson
                         10 -> Delete Student by Email
                         choose command:
                         """);
                 switch (scanner.nextLine().toLowerCase()){
                     case "1" ->{
                         System.out.println(groupServise.addNewGroup(new Group()));
                     }
                     case "2" ->{
                         System.out.println(groupServise.getGroupByName());
                     }
                     case "3" ->{
                         System.out.println(groupServise.UpdateGroupName());
                     }
                     case "4" ->{
                         groupServise.GetAllGroups(Database.groups);
                     }
                     case "5" ->{
                         System.out.println(studentService.addNewStudentToGroup(Database.groups,Database.students));
                     }
                     case "6" ->{

                     }
                     case "7" ->{
                         studentService.findStudentByFistName();
                     }
                     case "8" ->{
                         studentService.getAllStudentsByGroupName(Database.groups);
                     }
                     case "9" ->{
                         studentService.getAllStudentsLesson(Database.students);
                     }
                     case "10" ->{
                         studentService.deleteStudentByEmail(Database.students);
                     }
                 }
             }



        } else if (scanner.nextLine().equals("2")) {



        }else {
            System.out.println("Туура эмес!");
        }

    }
}