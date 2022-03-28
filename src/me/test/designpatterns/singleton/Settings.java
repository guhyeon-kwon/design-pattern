package me.test.designpatterns.singleton;

public class Settings {
    private static volatile Settings instance;

    private Settings() {};

    public static Settings getInstance(){
    if (instance == null){
        synchronized (Setting.class){
            if(instance == null){
                instance = new Settings();
            }
        }
    }
    return instance;
    }
}
