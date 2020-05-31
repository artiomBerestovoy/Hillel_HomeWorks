
public class Bus extends Vehicle{

    int quantityOfSieats;
	
    Bus(int cost, int fuelConsumption, int speed, int quantityOfSieats, String mark) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.quantityOfSieats = quantityOfSieats;
        this.mark = mark;

    }
    
    public String toString() {
        return "Bus: " + mark;
    }
    
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Bus other = (Bus) obj;
        if ((mark != other.mark) && (quantityOfSieats != other.quantityOfSieats)) {
            return false;
        }
        return true;
    }
}
