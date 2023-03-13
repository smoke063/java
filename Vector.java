public class Vector {
    private double x, y, z;

    public Vector() {
        setX(0);
        setY(0);
        setZ(0);
    }

    public Vector(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public Vector(Vector v) {
        this.setX(v.getX());
        this.setY(v.getY());
        this.setZ(v.getZ());
    }

    public double lengthModuleVector() {

        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector addVector(Vector v) {
        return new Vector(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ());
    }

    public Vector minusVector(Vector v) {
        return new Vector(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ());
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}