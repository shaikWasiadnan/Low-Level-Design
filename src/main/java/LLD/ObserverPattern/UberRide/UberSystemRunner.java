package LLD.ObserverPattern.UberRide;

public class UberSystemRunner {
    public static void main(String[] args) {
        //create object of subject/publisher
        UserRide ride = new UserRide();
        //create object of observer/subscriber
        UserApp userApp = new UserApp();
        DriverApp driverApp = new DriverApp();
        ride.attach(userApp);
        ride.attach(driverApp);
        ride.setRideMessage("Arriving");
        ride.setRideMessage("Arrived");
        ride.detach(driverApp);
        ride.setRideMessage("Completed");
        ride.detach(userApp);

    }
}

