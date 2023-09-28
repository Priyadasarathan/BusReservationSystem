package BusReservationSystem;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int no, boolean ac, int cap){   //constructor
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }
    
    
    // Create get and set methods

    public int getBusNo(){           //Accessor 
        return busNo;
    }
    
    public boolean isAc(){          //Mutator
        return ac;
    }
                                        
    public int getCapacity(){        //Accessor 
        return capacity;
    }

    public void setAc(boolean val){   //Mutator
        ac = val;
    }
    

    public void setCapacity(int cap){  //Mutator
        capacity = cap;
    }
    
    public void displayBusInfo(){
        System.out.println("Bus No:" + busNo + "Ac:" + ac + "Total Capacity:" + capacity);
    }
}
