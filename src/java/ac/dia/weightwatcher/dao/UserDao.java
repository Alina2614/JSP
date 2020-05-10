/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.dia.weightwatcher.dao;

import ac.dia.model.Users;

/**
 *
 * @author user
 */
public class UserDao extends WeightWatcherDao<Users>{

    public Users find(Users value) {
        return find(value, value.getUserId()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Users value) {
        super.delete(find(value)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Users value) {
        Users u =find(value);
        if(u!=null){
            u.setUserName(value.getUserName());
            u.setAge(value.getAge());
            u.setGender(value.getGender());
            u.setHeight(value.getHeight());
            u.setWeight(value.getWeight());
            u.setBmi(value.getBmi());
            
            super.update(value);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
