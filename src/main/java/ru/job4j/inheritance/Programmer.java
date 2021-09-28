package ru.job4j.inheritance;

public class Programmer extends Engineer{
    private int level;
    private String language;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, String birthday, String engineerType, int level, String language) {
        super(name, surname, education, birthday, engineerType);
        this.level = level;
        this.language = language;
    }

    public int getLevel(){
        return level;
    }

    public String getLanguage(){
        return language;
    }
}
