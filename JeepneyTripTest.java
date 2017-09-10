import junit.framework.TestCase;

public class JeepneyTripTest extends TestCase {
  JeepneyTrip a = new JeepneyTrip(4, 3, 0);
  JeepneyTrip b = new JeepneyTrip(6, 2, 0);
  JeepneyTrip c = new JeepneyTrip(5, 1, 0);
  JeepneyTrip d = new JeepneyTrip(3, 1, 1);
  JeepneyTrip e = new JeepneyTrip(6, 2, 2);
  JeepneyTrip f = new JeepneyTrip(5, 3, 3);
  JeepneyTrip g = new JeepneyTrip(6, 2, 1);
  JeepneyTrip h = new JeepneyTrip(4, 5, 2);
  JeepneyTrip i = new JeepneyTrip(5, 4, 1);
  
  public void testTripCreated() {  
    assertEquals(4.0, a.distance);
    assertEquals(3, a.totalPassengers);
    assertEquals(0, a.discountPassengers);
    
    assertEquals(6.0, b.distance);
    assertEquals(2, b.totalPassengers);
    assertEquals(0, b.discountPassengers);
    
    assertEquals(5.0, c.distance);
    assertEquals(1, c.totalPassengers);
    assertEquals(0, c.discountPassengers);
    
    assertEquals(3.0, d.distance);
    assertEquals(1, d.totalPassengers);
    assertEquals(1, d.discountPassengers);
    
    assertEquals(6.0, e.distance);
    assertEquals(2, e.totalPassengers);
    assertEquals(2, e.discountPassengers);
  
    assertEquals(5.0, f.distance);
    assertEquals(3, f.totalPassengers);
    assertEquals(3, f.discountPassengers);
    
    assertEquals(6.0, g.distance);
    assertEquals(2, g.totalPassengers);
    assertEquals(1, g.discountPassengers);
  
    assertEquals(4.0, h.distance);
    assertEquals(5, h.totalPassengers);
    assertEquals(2, h.discountPassengers);
    
    assertEquals(5.0, i.distance);
    assertEquals(4, i.totalPassengers);
    assertEquals(1, i.discountPassengers);
  
  }
  
  // test fareChange()
  // no case wherein total passengers < discount passengers
  public void testChangeNoDiscount() {
    assertEquals(9.0, a.fareChange(30));
    assertEquals(5.0, b.fareChange(20));
    assertEquals(3.0, c.fareChange(10));
  }
 
  public void testChangeEqualPassengers(){
    assertEquals(0.0, d.fareChange(6));
    assertEquals(2.0, e.fareChange(15));
    assertEquals(2.0, f.fareChange(20));
  }
  public void testChangeDiscount() {
    assertEquals(0.0, g.fareChange(14));
    assertEquals(7.0, h.fareChange(40));
    assertEquals(3.0, i.fareChange(30));
  }
  
  // test excessDistance
  public void testExcessDistance() {
    assertEquals(0.0, a.computeExcessDistance(4));
    assertEquals(1.0, b.computeExcessDistance(6));
    assertEquals(0.0, c.computeExcessDistance(5));
  }
  
  // test computeFare
  public void testComputeFare() {
    assertEquals(21.0, a.computeFare(3, 7, 4));
    assertEquals(13.0, b.computeFare(2, 6, 6));
    assertEquals(7.0, c.computeFare(1, 7, 5));
    assertEquals(6.0, d.computeFare(1, 6, 3));
    assertEquals(13.0, e.computeFare(2, 6, 6));
    assertEquals(18.0, f.computeFare(3, 6, 5));
    assertEquals(7.5, g.computeFare(1, 7, 6));
    assertEquals(6.5, g.computeFare(1, 6, 6));
    assertEquals(21.0, h.computeFare(3, 7, 4));
    assertEquals(12.0, h.computeFare(2, 6, 4));
    assertEquals(21.0, i.computeFare(3, 7, 5));
    assertEquals(6.0, h.computeFare(1, 6, 4));
  }
    
  // test totalFare
  public void testTotalFare() {
    assertEquals(21.0, a.totalFare(4, 3, 0));
    assertEquals(15.0, b.totalFare(6, 2, 0));
    assertEquals(7.0, c.totalFare(5, 1, 0));
    assertEquals(6.0, d.totalFare(3, 1, 1));
    assertEquals(13.0, e.totalFare(6, 2, 2));
    assertEquals(18.0, f.totalFare(5, 3, 3));
    assertEquals(14.0, g.totalFare(6, 2, 1));
    assertEquals(33.0, h.totalFare(4, 5, 2));
    assertEquals(27.0, i.totalFare(5, 4, 1));
  }
 
}