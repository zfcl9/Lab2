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
/*
Good catch. We'll post an updated diagram to clarify this (see below). As noted, from the original diagram, it isn't clear how the Builder is adding the customization, since the customizations variable of BubbleTea is private and the Builder class appears not to have access to it.
tl;dr — The Builder really can add a customization to the BubbleTea object it is building.
Below is the updated diagram and code clarifying what an "inner class" looks like (you'll also see a similar idea in your coding homework which will be posted later today which has you implement an iterator).
Updated diagram:
So the addCustomization method directly adds the customization to the list of customizations in the bubbleTea variable. Note, the private constructor of BubbleTea has also been omitted, so that has been added to clarify how the Builder class can construct a BubbleTea object.
For extra clarity, below is what the code would look like for the two relevant classes:

 */
