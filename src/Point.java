public class Point {
    private int x;
    private int y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int num1) {
        x = num1;
        y = num1;
    }
    public Point() {
        x = 0;
        y = 0;
    }

    //getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //methods
    public String coordinate() {
        return ("(" + x + ", " + y + ")");
    }
    public String quadrant() {
        if (x == 0 && y == 0) {
            return "origin";
        } else if  (x == 0) {
            return "on an axis";
        } else if (y == 0) {
            return "on an axis";
        } else if (x > 0 && y > 0) {
            return "I";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x < 0 && y > 0) {
            return "II";
        } else {
            return "III";
        }
    }
}
