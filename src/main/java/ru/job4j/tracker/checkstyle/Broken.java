package ru.job4j.tracker.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    private static final String NEW_VALUE = "";
    private String surname;
    private String name;

    public void broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d) {

    }
}