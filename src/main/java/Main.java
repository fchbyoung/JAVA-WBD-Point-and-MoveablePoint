public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.0,3.0);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(3.0,4.0);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());


    }
}
