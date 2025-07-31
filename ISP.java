interface RiderInterface{
    void bookRide();
    void rateDriver();
}

interface DriverInterface{
    void verifyThePassenger();
    void totalEarning();
    void ratePassenger();
}

class Passenger implements RiderInterface{
    public void bookRide(){
        System.out.println("Ride is booked.");
    }

    public void rateDriver(){
        System.out.println("Driver Rated Successfully.");
    }
}

class Driver implements DriverInterface{
        public void verifyThePassenger(){
            System.out.println("The Passenger has been verified.");
        }

        public void totalEarning(){
            System.out.println("Total Earning fetched.");
        }

        public void ratePassenger(){
            System.out.println("Passenger Rated Successfully.");
        }
}