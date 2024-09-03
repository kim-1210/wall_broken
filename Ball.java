public class Ball{
    private int x, y, radius;
    public Ball() {
        this(4, 0, 0);
    }
    public Ball(int radius, int x, int y){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getRadius() {
        return radius;
    }
}