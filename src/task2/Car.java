package task2;

public abstract class Car {
    protected String name;
    private String _color;
    private int maxSpeed;
    private String type;
    private int currentSpeed;
    private float price;
    public Car(String color, int maxSpeedd, String typee, int currentSpeedd, float pricee){
        _color = color;
        maxSpeed = maxSpeedd;
        type = typee;
        currentSpeed = currentSpeedd;
        price = pricee;
    }

    public void Start(int speed){
        currentSpeed = speed;
        System.out.println("Started" + name + "Current speed: " + speed);
    }

    public void Stop(){
        currentSpeed = 0;
        System.out.println("Stopped" + name + "Current speed: " + 0);
    }

}
