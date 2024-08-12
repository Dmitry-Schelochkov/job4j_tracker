package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("Ошибка активна? " + active);
        System.out.println("Номер ошибки " + status);
        System.out.println("Описание " + message);
    }

    public static void main(String[] args) {
        Error one = new Error();
        one.printInfo();
        Error two = new Error(true, 2, "Перегрев");
        two.printInfo();
        Error three = new Error(false, 3, "Скачок напряжения");
        three.printInfo();
    }
}
