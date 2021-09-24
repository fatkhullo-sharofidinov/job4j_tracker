package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;


    public  Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public Error(){
    }

    public void output(){
        System.out.println("Булеан статус: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.output();
        Error error1 = new Error(true, 10, "Ошибка 10!");
        error1.output();
        Error error2 = new Error(false,5,"Ошибка 5!");
        error2.output();
    }
}
