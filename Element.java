public abstract class Element {
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public Element(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
}
