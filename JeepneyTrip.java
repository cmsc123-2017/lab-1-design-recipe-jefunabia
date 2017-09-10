class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double EXCESS_KM_FARE = 0.5;
  final int FARE_DISCOUNT = 6;
  final int FARE_BASE = 7;
  
  // constructor
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  // double -> double
  // Accepts distance
  // Returns the excess distance if distance is > 5, else return 0
  double computeExcessDistance(double distance){
    if(distance <= BASE_KM){
      return 0;
    } else{
      return distance - BASE_KM;
    }
  }
  
  // int, double, double -> double
  // Accepts the number of passengers with their corresponding fare and distance w/ excess fare, 
  // Returns the fare for the passengers w/ excess distance fare
  double computeFare(int passengers, double fare, double distance){
    return passengers * (fare + (computeExcessDistance(distance) * EXCESS_KM_FARE));
  }
  
  // double, int, int -> double
  // Accepts the distance, total number of passengers and number of passengers with discount
  // Returns the total fare for all passengers, including passengers with discount
  double totalFare(double distance, int totalPassengers, int discountPassengers){
    if(totalPassengers == discountPassengers){
      return computeFare(discountPassengers, FARE_DISCOUNT, distance);
    } else{
      return computeFare(totalPassengers - discountPassengers, FARE_BASE, distance) 
      + computeFare(discountPassengers, FARE_DISCOUNT, distance);
    }
  }
  
  // double -> double
  // Accepts the total payment of all the passengers
  // Returns the change of the payment
  double fareChange(double payment) {
    return payment - totalFare(distance, totalPassengers, discountPassengers);
  }
}