/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.dia.weightwatcher.controller;

import ac.dia.model.Users;
import ac.dia.weightwatcher.dao.UserDao;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author user
 */
@ManagedBean
@RequestScoped
public class UserController {
    public Users user = new Users();
    public ArrayList<Users> userses = new ArrayList<Users>();
    UserDao userDao = new UserDao();
    public String msg = "";
    /**
     * Creates a new instance of UserController
     */
    public UserController() {
        
        
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public ArrayList<Users> getUserses() {
        return userses;
    }

    public void setUserses(ArrayList<Users> userses) {
        this.userses = userses;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public void save(){
        userDao.save(user);
        setMsg("User saved");
    }
    public void delete(){
        userDao.delete(user);
        setMsg("User deleted");
    }
    public void update(){
        userDao.update(user);
        setMsg("User updated");
    }
    public void find(){
        Users u=userDao.find(user);
        if(u!=null){
            user.setUserName(u.getUserName());
            user.setAge(u.getAge());
            user.setGender(u.getGender());
            user.setHeight(u.getHeight());
            user.setWeight(u.getWeight());
            user.setBmi(u.getBmi());
        }else{
            setMsg("User not found");
        }
    }
        public void display(){
            userses = userDao.getAll(user);
        }
        
    
    
    
}
