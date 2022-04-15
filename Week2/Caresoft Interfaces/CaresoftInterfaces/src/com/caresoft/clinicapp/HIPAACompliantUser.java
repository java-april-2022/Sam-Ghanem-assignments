package com.caresoft.clinicapp;

public interface HIPAACompliantUser {
    abstract boolean assignPin(int keypin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}

