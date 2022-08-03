package com.company.step1;
import java.util.ArrayList;

public class UserService implements Operations{
    final ArrayList<User> userList;
    public UserService(ArrayList<User> userList) {
        this.userList = userList;
    }
    @Override
    public void save(User user) {
        User awesome=new User();
        awesome.setName(user.getName());
        awesome.setId(user.getId());
        awesome.setEmail(user.getEmail());
        userList.add(awesome);
    }
    @Override
    public void update(Long id,User user) {
        User updatedUser=null;
        for (User item:userList) {
            if(id.equals(item.getId())){
                updatedUser=item;
            }
        }
        if(updatedUser==null)
            throw new NullPointerException("UPDATE PROCESS FAILED!\nThere is no user with that id");

        updatedUser.setName(user.getName());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setId(user.getId());
    }
    @Override
    public boolean delete(Long id) {
         if(!userList.removeIf(user->user.getId().equals(id))){
             throw new NullPointerException("DELETE PROCESS FAILED!\nThere is no user with that id!!");
         };
         return true;
    }
}
