public class ItemRecycleVisitorImp implements ItemRecycleVisitor{
    @Override
    public int visit(Cardboard cardboard){
        int cost = cardboard.getPriceperkg() * cardboard.getWeight();

        //apply 10% bonus if the cardboard weight is greater then 10 kg
        if (cardboard.getWeight() > 10){
            cost = (int) (cost *1.1);
        }
        return cost;
    }

    @Override
    public int visit(Glass glass){
        int cost = glass.getPriceperkg() * glass.getWeight();

        //apply 20% bonus if the glass weight is greater then 10 kg
        if (glass.getWeight() > 10){
            cost = (int) (cost *1.2);
        }
        return cost;
    }


    @Override
    public int visit(Plastic plastic){
        int cost = plastic.getPriceperkg() * plastic.getWeight();

        //apply 15% bonus if the glass weight is greater then 10 kg
        if (plastic.getWeight() > 10){
            cost = (int) (cost *1.15);
        }
        return cost;
    }
}