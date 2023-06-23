public class Lab_04_01_SalesTax {
    public static void main(String[] args){
    double purchasePrice = 15.50;
    double salesTax = 0.50;
    double calculatedTax = purchasePrice * salesTax;
    double totalPrice = purchasePrice + calculatedTax;
    System.out.println("The price of your purchase is $" + purchasePrice + ". " + "The sales tax for your purchase is $" + calculatedTax + ". " + "The total price including tax is $" + totalPrice + ".");
    }
}
