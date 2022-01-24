package com.upgrad.fsd;

public interface ApplicationForm {

    String[] supportedIdTypes = {"Aadhar", "PAN", "Driving Licence"};

    String getApplicantName();

    String getApplicantAge();

    String getApplicantIdNumber();

    String getApplicantAddress();
}
