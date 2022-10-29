package task2;

public abstract class Car {
    protected String name;
    protected String _color;
    protected int maxSpeed;
    protected String type;
    protected int currentSpeed;
    protected  float price;
    protected Car(String color, int maxSpeedd, String typee, int currentSpeedd, float pricee){
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

    public void Accelerate(int speed){
        currentSpeed+= speed;
        if (currentSpeed > maxSpeed){
            currentSpeed = maxSpeed;
        }
        System.out.println("Accelerated" + name + "Current speed: " + currentSpeed);
    }
}
