package ac.dia.model;
// Generated Dec 19, 2017 3:16:09 PM by Hibernate Tools 4.3.1



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private int userId;
     private String userName;
     private Integer age;
     private String gender;
     private Double weight;
     private Double height;
     private Double bmi;

    public Users() {
    }

	
    public Users(int userId) {
        this.userId = userId;
    }
    public Users(int userId, String userName, Integer age, String gender, Double weight, Double height, Double bmi) {
       this.userId = userId;
       this.userName = userName;
       this.age = age;
       this.gender = gender;
       this.weight = weight;
       this.height = height;
       this.bmi = bmi;
    }
   
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Double getWeight() {
        return this.weight;
    }
    
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getHeight() {
        return this.height;
    }
    
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getBmi() {
        return this.bmi;
    }
    
    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }




}

