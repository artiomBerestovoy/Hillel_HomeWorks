
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

        for (int i = 0; i < allVehicle.length; i++) {
            if ((allVehicle[i].speed >= minSpeed) && (allVehicle[i].speed <= maxSpeed)) {
                fastest = externdArray(fastest, allVehicle[i]);
            }
        }
        return fastest;
    }

    private Vehicle[] externdArray(Vehicle[] vehicles, Vehicle newVeh){
       if (vehicles.length == 0) {
           return vehicles = new Vehicle[]{newVeh};
       }

       Vehicle[] bufArray = new Vehicle[vehicles.length + 1];
       for (int i = 0; i < vehicles.length; i++){
           bufArray[i] = vehicles[i];
       }
       bufArray[vehicles.length] = newVeh;
       return bufArray;
    }
}
