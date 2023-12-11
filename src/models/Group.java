package models;

import java.util.ArrayList;

public class Group {
    private long id;
    private String groupName;
    private String description;
    private ArrayList<Lesson> lessons = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public Group() {
    }
    public Group(long id, String groupName, String description, ArrayList<Lesson> lessons, ArrayList<Student> students) {
        this.id =  id;
        this.groupName = groupName;
        this.description = description;
        this.lessons = lessons;
        this.students = students;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return " Group: " +"\n"+
                "  Id    = " + id +"\n"+
                " GroupName   = " + groupName + "\n"+
                " Description = " + description + "\n"+
                " Lessons     = " + lessons +"\n"+
                " Students    = " + students +
                '.';
    }


}
