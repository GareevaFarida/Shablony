package ru.geekbrains.patterns.lesson3.singleton;

public class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton localInstance = INSTANCE;
        if (localInstance == null)
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        return INSTANCE;
    }
}
