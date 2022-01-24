package com.upgrad.fsd;

public class MyApplicationForm implements ApplicationForm {

    public String getApplicantName() {
        return "Candidate name...";
    }

    public String getApplicantAge() {
        // Check DOB on ID Card.
        // Calculate age.
        return "28";
    }


    public String getApplicantIdNumber() {
        // Search for ID card
        // Check if ID card is a valid type.
        return "4627 2823 7777 1262";
    }


    public String getApplicantAddress() {
        // Search home address on Google Maps :)
        return "10 Downing Street";
    }
}
