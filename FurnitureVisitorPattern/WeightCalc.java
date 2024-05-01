package FurnitureVisitorPattern;

public class WeightCalc implements ShippingCalc{
    private static final double weightRate = 0.2;
    private static final double sizeRate = 0.1;
    private static final double distanceRate = 0.03;

    @Override
    public double chairCost(Chair chair) {

        return chair.getWeight() * weightRate + chair.getSize() * sizeRate;

    }

    @Override
    public double sofaCost(Sofa sofa) {

        return sofa.getPrice() * sizeRate + sofa.getDistance() * distanceRate;

    }

    @Override
    public double tableCost(Table table) {

        return table.getWeight() * weightRate + table.getSize() * sizeRate;

    }

}
