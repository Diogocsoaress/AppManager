package pt.GoMove.AppManager.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name="areas")
public class Area {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="are_ids")    
    private int id;
    @Column(name="are_points")    
    private int points;


    public Area() {}
    public int getId() {
        return id;
    }
    public int getPoints() {
        return points;
    }
}
