public class Cardboard implements ItemElement{
    private int weight;
    private int priceperkg;

    public Cardboard(int weight, int priceperkg) {
        this.weight = weight;
        this.priceperkg = priceperkg;
    }

    public int getWeight() {
        return weight;
    }

    public int getPriceperkg() {
        return priceperkg;
    }

    @Override
    public int accept(ItemRecycleVisitor visitor){
        return visitor.visit(this);
    }
}
