package pt.GoMove.AppManager.Models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="usr_id")    
    private int id;
    @Column(name="usr_name")    
    private String name;
    @Column(name="usr_place")    
    private String place;
    @Column(name="usr_bdate")    
    private LocalDate bdate;
    @Column(name="usr_gender")    
    private char gender;
    @Column(name="usr_email")    
    private String email;
    @Column(name="usr_password")    
    private String password;
    @Column(name="usr_points")    
    private int points;
    @Column(name="usr_area_id")    
    private String area;

    public User() {}
    public int getId() { return id; }

    public String getName() { return name; }

    public String getPlace() { return place; }

    public LocalDate getBdate() { return bdate; }

    public char getGender() { return gender; }

    public String getEmail() { return email; }

    public String getPassword() { return password; }

    public int getPoints() { return points; }

    public String getArea() { return area; }

    String QueryFindUnitPlans =
    "SELECT u.dis_id AS id, u.dis_nome AS name, "+
    "u.dis_pontos AS points, "+
    "p.pla_area AS area "+
    "FROM disciplinas u "+
    "INNER JOIN planoestudos p ON u.dis_id=p.pla_dis_id "+
    "INNER JOIN cursos c ON p.pla_cur_id=c.cur_id";

}
