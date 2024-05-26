package org.example;

public interface Vehicle {
    default String startMusic(){
        return "start Music default method called from Vehicle interface";
    }
}
interface Music{
    default String startMusic(){
        return "start Music default method called from Vehicle interface";
    }
}
//to solve multiple inheritance issue, we can either explicitly implement/define our own method or
// we can call different interface implementation using super keyword.
class Car implements Vehicle, Music {

    //providing my own explicit implementation/definition for the default method
//    @Override
//    public String startMusic(){
//      return "Music started....";
//    }

    // calling default method implementation/definition from interface using super keyword
//    @Override
//    public String startMusic(){
//      return Vehicle.super.startMusic() ;
//    }

    @Override
    public String startMusic(){
      return Vehicle.super.startMusic()+" ***** "+ Music.super.startMusic();
    }


    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.startMusic());

    }
}
