/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.dia.weightwatcher.controller;

import ac.dia.model.Excercise;
import ac.dia.weightwatcher.dao.ExerciseDao;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author user
 */
@ManagedBean
@RequestScoped
public class ExerciseController {

   public Excercise exercise = new Excercise();
    public ArrayList<Excercise> excercises = new ArrayList<Excercise>();
    public ExerciseDao exerciseDao= new ExerciseDao();
   
    public String msg = "";
    
    public ExerciseController() {
    }

    public Excercise getExercise() {
        return exercise;
    }

    public void setExercise(Excercise exercise) {
        this.exercise = exercise;
    }

    public ArrayList<Excercise> getExcercises() {
        return excercises;
    }

    public void setExcercises(ArrayList<Excercise> excercises) {
        this.excercises = excercises;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public void save(){
        exerciseDao.save(exercise);
     
        setMsg("User saved");
    }
    public void delete(){
        exerciseDao.delete(exercise);
        setMsg("User deleted");
    }
    public void update(){
        exerciseDao.update(exercise);
        setMsg("User updated");
    }
    public void find(){
        Excercise e=exerciseDao.find(exercise);
        if(exercise!=null){
            exercise.setExcerciseId(e.getExcerciseId());
            exercise.setExcerciseName(e.getExcerciseName());
            exercise.setType(e.getType());
            exercise.setTime(e.getTime());
            exercise.setBurnCalorie(e.getBurnCalorie());
            
        }else{
            setMsg("User not found");
        }
    }
        public void display(){
            excercises = exerciseDao.getAll(exercise);
        }
        
}
