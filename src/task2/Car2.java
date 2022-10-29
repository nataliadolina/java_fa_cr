package task2;

public class Car2 extends Car{

    public Car2(String color, int maxSpeedd, String typee, int currentSpeedd, float pricee){
        super(color, maxSpeedd, typee, currentSpeedd, pricee);
        name = "Car2";
    }

    @Override
    public void Stop() {
        System.out.println("This car is unstoppable just like me!!!!!!!!");
    }
}
