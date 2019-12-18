
public class Avtopark {
    
    Vehicle[] allVehicle;
	
    Avtopark(Vehicle[] allVehicle) {
        this.allVehicle = allVehicle;
    }
    
    public int costCount() {
        int amount = 0;
        
        for (int i = 0; i < allVehicle.length; i++) {
            amount += allVehicle[i].cost;
        }
        return amount;
    }
    
    public void sortByFuelConsumption() {
        boolean isSorted = false;
        int buf;
        
        while(!isSorted) {
            isSorted = true;
            
            for (int i = 0; i < allVehicle.length - 1; i++) {
                
                if (allVehicle[i].fuelConsumption > allVehicle[i + 1].fuelConsumption) {
                    isSorted = false;
            	    
                    buf = allVehicle[i].fuelConsumption;
                    allVehicle[i].fuelConsumption = allVehicle[i + 1].fuelConsumption;
                    allVehicle[i + 1].fuelConsumption = buf;
                }
            }
        }
    }
    
    public Vehicle[] serchFastest(int minSpeed, int maxSpeed) {
        Vehicle[] fastest = new Vehicle[0];
        Vehicle[] bufArray;
        
        for (int i = 0; i < allVehicle.length; i++) {
            if ((allVehicle[i].speed >= minSpeed) && (allVehicle[i].speed <= maxSpeed)) {
               
                if (fastest.length == 0) {
                    fastest = new Vehicle[1];
                    fastest[0] = allVehicle[i];
                } else {
                    bufArray = new Vehicle[fastest.length + 1];
                    
                    for (int j = 0; j < bufArray.length; j++) {
                
                        if (j == bufArray.length - 1) {
                            bufArray[j] = allVehicle[i];
                            fastest = bufArray;
                            break;
                        }
                        bufArray[j] = fastest[j];
                    }
                }
            }
        }
        return fastest;
    }
}
