package com.company;

public class Dog {
    private String nickname;
    private double age;
    private String chipNumber;

    public Dog(String nickname, double age, String chipNumber) {
        this.nickname = nickname;
        this.age = age;
        this.chipNumber = chipNumber;
    }

    public Dog() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getChipNumber() {
        return chipNumber;
    }

    public void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber;
    }
}
