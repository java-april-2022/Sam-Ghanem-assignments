package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

	public AdminUser(Integer id,String role) {
		super(id);
		this.setRole(role);
		this.securityIncidents = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
//... imports class definition...
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters


	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return this.securityIncidents;
	}

	@Override
	public boolean assignPin(int keypin) {
		// TODO Auto-generated method stub 
		String str = Integer.toString(keypin);
		System.out.println(str.length());
		if (str.length() < 6 ) {
			return false;
		}
		this.keypin = keypin;
		return true;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (confirmedAuthID != this.id) {
			this.authIncident();
			return false;
		}
		return true;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
