public class Main {
    public static void main(String[] args)
    {
        double priceOfItem = 101.00;
        double totalPrice = 0;
        double shippingCost = 0;
        final double SHIPPING_COST_FACTOR = 100.00;
        final double TAX_PERCENTAGE = .02;
        if (priceOfItem > SHIPPING_COST_FACTOR)
        {
            System.out.println("Shipping is free! Your total cost is " + priceOfItem);
        }
        else if (priceOfItem < SHIPPING_COST_FACTOR)
        {
            shippingCost = priceOfItem * TAX_PERCENTAGE;
            totalPrice = shippingCost + priceOfItem;
            System.out.println("Your shipping cost is " + shippingCost + " and your total cost is " + totalPrice);
        }
    }
}