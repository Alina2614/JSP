/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.dia.weightwatcher.controller;

import ac.dia.model.Excercise;
import ac.dia.weightwatcher.dao.ExerciseDao;
import ac.dia.model.Meal;
import ac.dia.weightwatcher.dao.MealDao;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author user
 */
@ManagedBean
@RequestScoped
public class MealController  implements java.io.Serializable {

    public Meal meal =new Meal();
    public ArrayList<Meal> meals = new ArrayList<Meal>();
    public MealDao mealDao= new MealDao();
   
    public String msg = "";

    
    public Meal getMeal(){
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    public String getMsg() {
        return msg;
    }

    /**
     * Creates a new instance of UserController
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MealController() {
    }

    public void save(){
        mealDao.save(meal);
     
        setMsg("Meal saved");
    }
    public void delete(){
       mealDao.delete(meal);
        setMsg("Meal deleted");
    }
    public void update(){
        mealDao.update(meal);
        setMsg("Meal updated");
    }
    public void find(){
        Meal m=mealDao.find(meal);
        if(meal!=null){
            meal.setMealId(m.getMealId());
            meal.setMealName(m.getMealName());
            meal.setMealUnit(m.getMealUnit());
            meal.setMealCalorie(m.getMealCalorie());
            
        }else{
            setMsg("Data not found");
        }
    }
        public void display(){
            meals = mealDao.getAll(meal);
        }
        
    
    
    
}

/**
 *
 * @author user
 */

