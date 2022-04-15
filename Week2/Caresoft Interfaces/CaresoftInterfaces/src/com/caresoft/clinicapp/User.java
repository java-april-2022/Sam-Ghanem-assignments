package com.caresoft.clinicapp;

public class User {
	
	    protected Integer id;
	    protected int keypin;
	    
	    // TO DO: Getters and setters
	    // Implement a constructor that takes an ID
	    
	    public User(Integer id) {
	    	this.id = id;
	    	
	    }

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public int getPin() {
			return keypin;
		}

		public void setPin(int pin) {
			this.keypin = pin;
		}
	    
	}



