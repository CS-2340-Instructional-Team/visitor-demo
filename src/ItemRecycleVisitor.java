public interface ItemRecycleVisitor {
    public int visit(Cardboard cardboard);
    public int visit(Glass glass);
    public int visit(Plastic plastic);
}
