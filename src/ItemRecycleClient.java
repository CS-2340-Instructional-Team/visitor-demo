public class ItemRecycleClient {
    private static ItemRecycleVisitor visitor;
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Cardboard(10, 2),
                new Cardboard(6, 12),
                new Glass(3, 5),
                new Glass(5, 7),
                new Plastic(8, 1),
                new Plastic(10, 3),

        };

        int total = calculatePrice(items);
        System.out.println("Total Profit = $" + total);

    }

    public static int calculatePrice(ItemElement[] items){
        visitor = new ItemRecycleVisitorImp();
        int sum = 0;
        for(ItemElement item: items) {
            sum+= item.accept(visitor);
        }
        return sum;

    }
}
