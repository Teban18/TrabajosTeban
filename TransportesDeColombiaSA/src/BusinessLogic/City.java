/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author Teban18
 */
public class City {
    
    private String name;
    private String state;
    private String deparment;
    private String created_date;

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getCreated_date() {
        return created_date;
    }
  
    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getDeparment() {
        return deparment;
    }
    
       
}
