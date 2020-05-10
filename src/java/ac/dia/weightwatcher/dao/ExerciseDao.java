/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.dia.weightwatcher.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import ac.dia.model.Excercise;



/**
 *
 * @author user
 */
public class ExerciseDao extends WeightWatcherDao<Excercise>{

    public Excercise find(Excercise value) {
        return find(value, value.getExcerciseId()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Excercise value) {
        super.delete(find(value)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Excercise value) {
        Excercise ex =find(value);
        if(ex!=null){
            ex.setExcerciseId(value.getExcerciseId());
            ex.setExcerciseName(value.getExcerciseName());
            ex.setType(value.getType());
            ex.setTime(value.getTime());
            ex.setBurnCalorie(value.getBurnCalorie());
            
            super.update(value);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
















