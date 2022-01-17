package pt.GoMove.AppManager.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name="coords")
public class Coords {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="coords_are_id")    
    private int id;

    @Column(name="crd_latone")    
    private float latone;
    @Column(name="crd_lngone")    
    private float lngone;

    @Column(name="crd_lattwo")    
    private float lattwo;
    @Column(name="crd_lngtwo")    
    private float lngtwo;

    @Column(name="crd_latthree")    
    private float latthree;
    @Column(name="crd_lngthree")    
    private float lngthree;

    @Column(name="crd_latfour")    
    private float latfour;
    @Column(name="crd_lngfour")    
    private float lngfour;


    public Coords() {}
    public int getId() {
        return id;
    }
    
    public float getlatone() {
        return latone;
    }
    public float getlngone() {
        return lngone;
    }

    public float getlattwo() {
        return lattwo;
    }
    public float getlngtwo() {
        return lngtwo;
    }

    public float getlatthree() {
        return latthree;
    }
    public float getlngthree() {
        return lngthree;
    }

    public float getlatfour() {
        return latfour;
    }
    public float getlngfour() {
        return lngfour;
    }
}
