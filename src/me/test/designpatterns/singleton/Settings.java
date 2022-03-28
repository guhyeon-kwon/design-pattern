package me.test.designpatterns.singleton;

public enum Settings {
    INSTANCE;

    Settings(){}

    private Integer number;

    public Integer getNumber(){
       return number;
    }

    public void setNumber(Integer number){
        this.number = number;
    }
}
