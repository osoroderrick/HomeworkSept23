package homework2;

public class Resolution {
    private int width;
    private int heiht;

    public Resolution(int width, int heiht) {
        this.width = width;
        this.heiht = heiht;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeiht() {
        return heiht;
    }

    public void setHeiht(int heiht) {
        this.heiht = heiht;
    }

    @Override
    public String toString() {
        return "Resolution{" + "width=" + width + ", heiht=" + heiht + '}';
    }
}
