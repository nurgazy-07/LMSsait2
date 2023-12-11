package servises.serviseImpl;

import models.Database;
import models.Group;
import models.UnigId;
import servises.GroupServise;

import java.util.ArrayList;
import java.util.Scanner;

public class GroupServiseImpl implements GroupServise {
    @Override
    public Group addNewGroup(Group group) {
        Scanner scanner = new Scanner(System.in);
        group.setId(UnigId.IK());
        System.out.print("Жаны группага ат жазыныз: ");
        group.setGroupName(scanner.nextLine());
        System.out.print("группанын суроттомоосун жазыныз: ");
        group.setDescription(scanner.nextLine());
        Database.groups.add(group);
        return group;
    }
    @Override
    public String getGroupByName() {
        System.out.print("Группанын атын жазыныз: ");
        String soz = new Scanner(System.in).nextLine();
        for (Group group : Database.groups) {
            if(group.getGroupName().equals(soz)){
                System.out.println(group);
            }else System.out.println("error!");
        }
        return null;
    }

    @Override
    public String UpdateGroupName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Озгортууну каалаган группанын атын жазыныз: ");
        String num = scanner.nextLine();
        for (Group group : Database.groups) {
           try {
               if(group.getGroupName().equals(num)){
                   System.out.println(group);
                   System.out.println("Группанын жаны атын жазыныз: ");
                   String soz = scanner.nextLine();
                   group.setGroupName(soz);
                   return "Группа ийгиликтуу озгортулду";
               }throw new RuntimeException("Мындай группа жок!");
           }catch (RuntimeException e){
               System.out.println(e.getMessage());
           }
        }
        return null;
    }

    @Override
    public void GetAllGroups(ArrayList<Group> groups) {
        for (Group group : groups) {
            System.out.println(group);
        }
    }

}
