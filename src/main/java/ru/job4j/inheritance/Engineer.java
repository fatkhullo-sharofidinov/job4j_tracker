package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String engineerType;

    public Engineer(String name, String surname, String education, String birthday, String engineerType) {
        super(name, surname, education, birthday);
        this.engineerType = engineerType;
    }

    public String getEngineerType() {
        return engineerType;
    }
}
