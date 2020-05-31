
public class Van extends Vehicle {
   
	int trunkVolume;
	
    Van(int cost, int fuelConsumption, int speed, int trunkVolume, String mark) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.trunkVolume = trunkVolume;
        this.mark = mark;
	}
    
    public String toString() {
        return "Van: " + mark;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Van other = (Van) obj;
        if ((mark != other.mark) && (trunkVolume != other.trunkVolume)) {
            return false;
        }
        return true;
    }
}
