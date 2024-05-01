package FurnitureVisitorPattern;

public class ECommerce {
    public static void main(String[] args) {

        ShippingCalc weightCalc = new WeightCalc();

        Chair chair = new Chair(500, 10, 2);
        Table table = new Table(1500, 5, 3);
        Sofa sofa = new Sofa(1000, 50);

        double chairShippingCost = chair.accept(weightCalc);
        double tableShippingCost = table.accept(weightCalc);
        double sofaShippingCost = sofa.accept(weightCalc);

        System.out.println("Artemio's Furniture Receipt");
        System.out.println("=======================================\n");
        System.out.println("Chair Price:\t\t\t\t₱" + chair.getPrice());
        System.out.println("Shipping:\t\t\t\t\t₱" + chairShippingCost);
        System.out.println("\n=======================================\n");
        System.out.println("Table Price:\t\t\t\t₱" + table.getPrice());
        System.out.println("Shipping cost for Table:\t₱" + tableShippingCost);
        System.out.println("\n=======================================\n");
        System.out.println("Sofa Price:\t\t\t\t\t₱" + sofa.getPrice());
        System.out.println("Shipping cost for Sofa:\t\t₱" + sofaShippingCost);
        System.out.println("\n=======================================\n");
        System.out.println("Total:\t\t\t\t\t\t₱" + (chair.getPrice() + chairShippingCost
                                    + table.getPrice() + tableShippingCost
                                    + sofa.getPrice() + sofaShippingCost));
        System.out.println("\nThank you for your purchase!\n"
                            + "\nGod Bless!\n");

    }

}
