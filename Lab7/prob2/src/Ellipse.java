public class Ellipse implements ClosedCurve{

    private double semiMajor;
    private double e;

    public Ellipse(double semiMajor, double e) {
        this.semiMajor = semiMajor;
        this.e = e;
    }

    @Override
    public double computePerimeter() {
        return 4 * e * semiMajor;
    }
}
