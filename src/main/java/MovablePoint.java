public class MovablePoint extends Point {
    private double xSpeed;
    private double ySpeed;

    public MovablePoint() {
        this.xSpeed = 0.0;
        this.ySpeed = 0.0;
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed() {
        double[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{(x = " + this.getX() + ", y = " + this.getY() + ")" + "(speed (" + this.xSpeed + ", " + this.ySpeed + ") " + "}";
    }

    public MovablePoint move() {
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
        return this;
    }

}
