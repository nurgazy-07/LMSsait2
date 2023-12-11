package models;

public class Student {
    private long id;
    private String studentFistName;
    private String studentLastName;
    private String email;
    private String password;
    private Gen gender;

    public Student() {
    }

    public Student(long id, String studentFistName, String studentLastName, String email, String password, Gen gender) {
        this.id = id;
        this.studentFistName = studentFistName;
        this.studentLastName = studentLastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentFistName() {
        return studentFistName;
    }

    public void setStudentFistName(String studentFistName) {
        this.studentFistName = studentFistName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gen getGender() {
        return gender;
    }

    public void setGender(Gen gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  " Group: " +"\n"+
                "  Id    = " + id +"\n"+
                " StudentFistName = " + studentFistName + "\n"+
                " StudentLastName = " + studentLastName + "\n"+
                " Email           = " + email +"\n"+
                " Password        = " + password +"\n"+
                " Gender          = " + gender +
                '.';
    }

}
