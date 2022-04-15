package com.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUser {




	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignPin(int keypin) {
		// TODO Auto-generated method stub
		String str = Integer.toString(keypin);
		System.out.println(str.length());
		if (str.length() < 4) {
			return false;
		}
		this.keypin = keypin;
		return true;
		
	}
	

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (this.id == confirmedAuthID ) {
			return true;
		}
		return false;
	}

}
