package models;

public class UnigId {
    private static long id = 1;
    public static long IK(){
        return id++;
    }
}
