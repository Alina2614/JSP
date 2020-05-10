package ac.dia.model;
// Generated Dec 19, 2017 3:16:09 PM by Hibernate Tools 4.3.1




public class Meal  implements java.io.Serializable {


     private int mealId;
     private String mealName;
     private Integer mealUnit;
     private Integer mealCalorie;

    public Meal() {
    }

	
    public Meal(int mealId) {
        this.mealId = mealId;
    }
    public Meal(int mealId, String mealName, Integer mealUnit, Integer mealCalorie) {
       this.mealId = mealId;
       this.mealName = mealName;
       this.mealUnit = mealUnit;
       this.mealCalorie = mealCalorie;
    }
   
    public int getMealId() {
        return this.mealId;
    }
    
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }
    public String getMealName() {
        return this.mealName;
    }
    
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
    public Integer getMealUnit() {
        return this.mealUnit;
    }
    
    public void setMealUnit(Integer mealUnit) {
        this.mealUnit = mealUnit;
    }
    public Integer getMealCalorie() {
        return this.mealCalorie;
    }
    
    public void setMealCalorie(Integer mealCalorie) {
        this.mealCalorie = mealCalorie;
    }




}


