/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

/**
 *
 * @author hp
 */
@Entity
@NamedQuery(name = "findAll", query = "from Salle")
@NamedNativeQuery(name = "findAllNative", query = "select * from salle", resultClass = Salle.class)
public class Salle implements Serializable{
    
    private static final long serialVersionUID = 4748948810652977782L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String code;
        
    public Salle(){}


    public int getId() {
        return id;
    }

    public Salle(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + '}';
    }
    
    
}
