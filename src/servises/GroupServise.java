package servises;

import models.Database;
import models.Group;

import java.util.ArrayList;

public interface GroupServise {
    Group addNewGroup(Group group);
    String getGroupByName();
    String UpdateGroupName();
    void GetAllGroups(ArrayList<Group> groups);

}
