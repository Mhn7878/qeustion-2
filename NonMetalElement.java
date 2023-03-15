public class NonMetalElement extends  Element{
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println(getSymbol() +  " " +  getAtomicNumber() + " " +  getAtomicWeight());
        System.out.println("nonmetals are poor conductors");
    }
}
