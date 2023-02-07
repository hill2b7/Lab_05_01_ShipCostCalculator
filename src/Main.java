public class Main {
    public static void main(String[] args)
    {
        double priceOfItem = 101.00; //declarations
        double totalPrice = 0; //declarations
        double shippingCost = 0; //declarations
        final double SHIPPING_COST_FACTOR = 100.00; //using final because it is a constant that doesn't change
        final double TAX_PERCENTAGE = .02; //using final because it is a constant that doesn't change
        if (priceOfItem > SHIPPING_COST_FACTOR) //If the price of the item is greater than the cost factor then code in the block is executed
        {
            System.out.println("Shipping is free! Your total cost is " + priceOfItem);
        }
        else if (priceOfItem < SHIPPING_COST_FACTOR) // if the first if statement is not true then this condition would be next. If true then the code block runs
        {
            shippingCost = priceOfItem * TAX_PERCENTAGE; //calculation for shipping cost
            totalPrice = shippingCost + priceOfItem; // calculation for total price
            System.out.println("Your shipping cost is " + shippingCost + " and your total cost is " + totalPrice); //system output for results
        }
    }
}