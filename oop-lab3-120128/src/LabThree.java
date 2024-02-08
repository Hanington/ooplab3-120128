class VehicleRentalService {
    void rentRide(String vehicleType, String useCase, int rentalDuration, boolean insuranceIncluded) {
        if (insuranceIncluded) {
            System.out.println("Rent a vehicle[INSURANCE BUNDLE] of Type:" + vehicleType + " to be used for "
                    + useCase + " for a duration of " + rentalDuration + "days");
        } else {
            System.out.println("Rent a vehicle of Type:" + vehicleType + " to be used for "
                    + useCase + " for a duration of " + rentalDuration + "days");
        }
    }

    void rentRide(String vehicleType, String useCase, int rentalDuration, double capacity, boolean insuranceIncluded) {
        if (insuranceIncluded) {
            System.out.println("Rent a vehicle[INSURANCE BUNDLE] of Type:" + vehicleType + " to be used for "
                    + useCase + " for a duration of " + rentalDuration + "days with a capacity of " + capacity + "kg");
        } else {
            System.out.println("Rent a vehicle of Type:" + vehicleType + " to be used for "
                    + useCase + " for a duration of " + rentalDuration + "days with a capacity of " + capacity + "kg");
        }
    }
}
    class MyMain {
        public static void main(String[] args) {
            VehicleRentalService service = new VehicleRentalService();


            System.out.println("Personal Saloon");
            service.rentRide("Saloon", "Personal", 3, true);
            System.out.println("******************************");
            System.out.println("Chauffeur Service");
            service.rentRide("Saloon", "Cooperative", 5, true);
            System.out.println("******************************");
            System.out.println("School Van");
            service.rentRide("Van", "School Transport", 3, true);
            System.out.println("******************************");
            System.out.println("Tourist Van");
            service.rentRide("Van", "Tourist Transport", 12, true);
            System.out.println("******************************");
            System.out.println("Shipping Truck");
            service.rentRide("Truck", "Shipping", 4, 340, true);
            System.out.println("******************************");
            System.out.println("Delivery Scooter");
            service.rentRide("Scooter", "Food Delivery", 1, 25, false);
            System.out.println("******************************");
            System.out.println("Delivery Bike");
            service.rentRide("Motorbike", "Parcel Delivery", 1, 25, true);
        }
    }
