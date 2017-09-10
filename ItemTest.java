import junit.framework.TestCase;

public class ItemTest extends TestCase {
  Item a = new Item(600, 0.20);
  Item b = new Item(1200, 0.15);
  Item c = new Item(1000, 0.50);
  
  public void testCreateItem() {
    assertEquals(600.0, a.price);
    assertEquals(0.20, a.salePercent);
    
    assertEquals(1200.0, b.price);
    assertEquals(0.15, b.salePercent);
    
    assertEquals(1000.0, c.price);
    assertEquals(0.50, c.salePercent);
  }
  
  public void testSalePrice1000(){
    assertEquals(600.0, a.salePrice1000(600, 0.20));
    assertEquals(1020.0, b.salePrice1000(1200, 0.15));
    assertEquals(1000.0, c.salePrice1000(1000, 0.50));
  }
  
  public void testComputeSalePrice(){
    assertEquals(480.0, a.computeSalePrice(600, 0.20));
    assertEquals(1020.0, b.computeSalePrice(1200, 0.15));
    assertEquals(500.0, c.computeSalePrice(1000, 0.50));
  }
  
}
