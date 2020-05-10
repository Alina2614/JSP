package ac.dia.model;
// Generated Dec 19, 2017 3:16:09 PM by Hibernate Tools 4.3.1




public class Excercise  implements java.io.Serializable {


     private int excerciseId;
     private String excerciseName;
     private String type;
     private Integer time;
     private Integer burnCalorie;

    public Excercise() {
    }

	
    public Excercise(int excerciseId) {
        this.excerciseId = excerciseId;
    }
    public Excercise(int excerciseId, String excerciseName, String type, Integer time, Integer burnCalorie) {
       this.excerciseId = excerciseId;
       this.excerciseName = excerciseName;
       this.type = type;
       this.time = time;
       this.burnCalorie = burnCalorie;
    }
   
    public int getExcerciseId() {
        return this.excerciseId;
    }
    
    public void setExcerciseId(int excerciseId) {
        this.excerciseId = excerciseId;
    }
    public String getExcerciseName() {
        return this.excerciseName;
    }
    
    public void setExcerciseName(String excerciseName) {
        this.excerciseName = excerciseName;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Integer getTime() {
        return this.time;
    }
    
    public void setTime(Integer time) {
        this.time = time;
    }
    public Integer getBurnCalorie() {
        return this.burnCalorie;
    }
    
    public void setBurnCalorie(Integer burnCalorie) {
        this.burnCalorie = burnCalorie;
    }




}


