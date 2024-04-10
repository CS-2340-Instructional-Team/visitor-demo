public class Plastic implements ItemElement{
        private int weight;
        private int priceperkg;

        public Plastic(int weight, int priceperkg) {
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
