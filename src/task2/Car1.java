package task2;

public class Car1 extends Car{

    public Car1(String color, int maxSpeedd, String typee, int currentSpeedd, float pricee){
        super(color, maxSpeedd, typee, currentSpeedd, pricee);
        name = "Car1";
    }

    public void Bip(){
        System.out.println("bip-bip");
    }

}
