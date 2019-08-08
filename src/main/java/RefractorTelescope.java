public final class RefractorTelescope extends Telescope {
    private int numberOfLenses;

    public RefractorTelescope() {
        this.numberOfLenses = 24;
    }

    public RefractorTelescope(int numberOfLenses) {
        if (numberOfLenses < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
        this.numberOfLenses = numberOfLenses;
    }

    public RefractorTelescope(double diameter, int fLength, int numberOfLenses) {
        super(diameter, fLength);
        if (numberOfLenses < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
        this.numberOfLenses = numberOfLenses;
    }

    @Override
    public boolean hasColorError() {
        return true;
    }

    public int getNumberOfLenses() {
        return numberOfLenses;
    }

    public void setNumberOfLenses(int numberOfLenses) {
        if (numberOfLenses < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
        this.numberOfLenses = numberOfLenses;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfLenses: " + numberOfLenses + ".";
    }
}
