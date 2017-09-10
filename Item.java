public class Item {
  double price;
  double salePercent;
  
  final int PRICE_LIMIT = 1000;
  
  Item(double price, double salePercent){
    this.price = price;
    this.salePercent = salePercent;
  }
  
  // double, double -> double
  // Accepts the item price and its sale percentage
  // Returns the reduced price of an item 
  double computeSalePrice(double price, double sale) {
    return price - (sale * price);
  }

  // double, double -> double
  // Accepts the item price and its sale percentage
  // If item price exceeds 1000, apply the sale percentage, else do not apply the sale percentage
  // returns the original price or reduced price of an item
  double salePrice1000(double price, double sale) {
    if (price > PRICE_LIMIT) {
      return computeSalePrice(price, sale);
    } else {
      return price;
    }
  }
  
}
