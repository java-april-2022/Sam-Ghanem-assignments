package com.Ghanem.login.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty(message = "Username plz")
	@Size(min=3,message = "Username must be 3 characters plz and thank you!!!!!")
	private String user_name;
	
	@NotEmpty(message = "Password is needed plz")
	@Size(min=8,message = "Password must be 8 characters long plz and thank you!!!!!")
	private String password;
	 
	@NotEmpty(message = "email plz")
	@Email(message = "email must be real!!!!!")
	private String email;
	
	@Transient
	@NotEmpty(message = "Password is needed ")
	@Size(min=8,message = "Password needs to match plz and thank you!!!!!")
	private String confirm;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
        }
	
	
	public User() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getConpassword() {
		return confirm;
	}


	public void setConpassword(String conpassword) {
		this.confirm = conpassword;
	}
	
	

}
