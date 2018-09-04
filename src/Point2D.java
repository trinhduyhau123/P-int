public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        x = 1;
        y = 1;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        double[] array = {x, y};
        return array;
    }

    @Override
    public String toString() {
        return "("+x+ ","+ y+")";
    }
}
