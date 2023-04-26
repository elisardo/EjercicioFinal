package com.uax.plantilla.model;


import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
@Entity
@Table(name ="Contacto")
public class Contacto {

	
    

@Id
@GeneratedValue
@Column(name = "id", unique = true)
private int id;  
@Column(name="name")
private String name;
@Column(name="email")
private String email;    

public int getId() {    
    return id;    
}    
public void setId(int id) {    
    this.id = id;    
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}   

}

