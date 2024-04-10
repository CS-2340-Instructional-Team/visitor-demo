public class Glass implements ItemElement{
        private int weight;
        private int priceperkg;

        public Glass(int weight, int priceperkg) {
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
