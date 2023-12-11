package servises;

import models.Group;
import models.Student;

import java.util.ArrayList;

public interface StudentService {
    Student addNewStudentToGroup(ArrayList<Group> students,ArrayList<Student> studentsss);
//    Student updateStudent();
    void findStudentByFistName();
    void getAllStudentsByGroupName(ArrayList<Group> groups);
    void getAllStudentsLesson(ArrayList<Student> students);
    void deleteStudentByEmail(ArrayList<Student> students);

}
