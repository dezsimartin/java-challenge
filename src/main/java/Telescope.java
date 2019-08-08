public abstract class Telescope {
    private double diameter;
    private int fLength;

    public Telescope() {
        this.diameter = 10;
        this.fLength = 20;
    }

    public Telescope(double diameter, int fLength) {
        if (diameter < 0 || fLength < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
            this.diameter = diameter;
            this.fLength = fLength;

    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
        this.diameter = diameter;
    }

    public int getfLength() {
        return fLength;
    }

    public void setfLength(int fLength) {
        if (fLength < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
        this.fLength = fLength;
    }

    public abstract boolean hasColorError();

    @Override
    public String toString() {
        return "Telescope: diameter: " + diameter + ", fLength: " + fLength + ".";
    }
}
