
public class SportCar extends Vehicle {
    
    int power;
        
    SportCar(int cost, int fuelConsumption, int speed, int power, String mark) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.power = power;
        this.mark = mark;
    }
    
    public String toString() {
        return "Sport car: " + mark;
    }
    
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        SportCar other = (SportCar) obj;
        if ((power != other.power) && (speed != other.speed)) {
            return false;
        }
        return true;
    }    
}
