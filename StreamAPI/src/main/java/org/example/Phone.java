package org.example;

public interface Phone {
    String setAlarm();
    String startGame();
    void openMsg();

    default String startMusic(){
        return "Music started";
    }
    default void addContact(){
        System.out.println("Contact added");
    }
}
class Smartphone implements Phone{

    @Override
    public String setAlarm(){
        return "Alarm Set";
    }
    @Override
    public String startGame(){
        return "Game Started";
    }

    @Override
    public void openMsg(){
        System.out.println("Msg...");

    }
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        System.out.println(smartphone.setAlarm());
        System.out.println(smartphone.startGame());
        smartphone.openMsg();
        System.out.println(smartphone.startMusic());
        smartphone.addContact();

    }

}
