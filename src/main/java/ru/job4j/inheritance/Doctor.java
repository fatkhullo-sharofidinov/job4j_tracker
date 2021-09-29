package ru.job4j.inheritance;

public class Doctor extends Profession{
    private String doctorType;
    private int experience;

    public Doctor(String name, String surname, String education, String birthday, String doctorType, int experience) {
        super(name, surname, education, birthday);
        this.doctorType = doctorType;
        this.experience = experience;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public int getExperience() {
        return  experience;
    }
}
