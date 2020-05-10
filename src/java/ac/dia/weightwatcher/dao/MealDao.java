/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.dia.weightwatcher.dao;

import ac.dia.model.Meal;

/**
 *
 * @author user
 */
public class MealDao extends WeightWatcherDao<Meal>{
    public Meal find(Meal value) {
        return find(value, value.getMealId()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Meal value) {
        super.delete(find(value)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Meal value) {
        Meal m =find(value);
        if(m!=null){
            m.setMealName(value.getMealName());
            m.setMealUnit(value.getMealUnit());
            m.setMealCalorie(value.getMealCalorie());
            
            
            super.update(value);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
}
