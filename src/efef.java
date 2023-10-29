public class efef {
    class BubbleTea {
        // private variables are here...

        private BubbleTea(String name, double basePrice, TeaFlavour teaFlavor) {}

        public double calculatePrice() {
            return 0;
        }

        // this class below has access to private methods, variables, and constructors of the BubbleTea class it is defined in
        public static class Builder {
            private BubbleTea bubbleTea;

            public Builder(String name, double basePrice, TeaFlavour teaFlavor) {
                bubbleTea = new BubbleTea(name, basePrice, teaFlavor);
            }

            public Builder addCustomization(Item customization) {
                bubbleTea.customizations.add(customization);
                return this;
            }

            public BubbleTea build() {
                return bubbleTea;
            }
        }
    }
}
