public final class NewtonTelescope extends Telescope{

    private double secondMirrorSize;

    public NewtonTelescope() {
       this.secondMirrorSize = 15;
    }

    public NewtonTelescope(double secondMirrorSize) {
        if (secondMirrorSize < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
        this.secondMirrorSize = secondMirrorSize;
    }

    public NewtonTelescope(double diameter, int fLength, double secondMirrorSize) {
        super(diameter, fLength);
        if (secondMirrorSize < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
        this.secondMirrorSize = secondMirrorSize;
    }

    @Override
    public boolean hasColorError() {
        return false;
    }

    public double getSecondMirrorSize() {
        return secondMirrorSize;
    }

    public void setSecondMirrorSize(double secondMirrorSize) {
        if (secondMirrorSize < 0) throw new IllegalArgumentException("Nem lehet kisebb 0-nál egyik adattag sem!");
        this.secondMirrorSize = secondMirrorSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", secondMirrorSize: " + secondMirrorSize + ".";
    }
}
