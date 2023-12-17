package Sanjeevani.pojo;

import java.sql.Date;


public class PatientPojo {

    @Override
    public String toString() {
        return "PatientPojo{" + "patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", marriedStatus=" + marriedStatus + ", address=" + address + ", city=" + city + ", mno=" + mno + ", date=" + date + ", otp=" + otp + ", opd=" + opd + ", doctorId=" + doctorId + ", aptStatus=" + aptStatus + '}';
    }

    public PatientPojo() {
    }
    private String patientId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String marriedStatus;
    private String address;
    private String city;
    private String mno;
    private Date date;
    private int otp;
    private String opd;
    private String doctorId;
    private String aptStatus;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    public void setMarriedStatus(String marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getAptStatus() {
        return aptStatus;
    }

    public void setAptStatus(String aptStatus) {
        this.aptStatus = aptStatus;
    }
    

}
