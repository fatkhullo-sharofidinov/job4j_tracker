package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    private String surgeonType;

    public Surgeon(String name, String surname, String education, String birthday, String doctorType, int experience, String surgeonType) {
        super(name, surname, education, birthday, doctorType, experience);
        this.surgeonType = surgeonType;
    }

    public String getSurgeonType() {
        return surgeonType;
    }
}
