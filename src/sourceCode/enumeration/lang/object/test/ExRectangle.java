package src.sourceCode.enumeration.lang.object.test;

public class ExRectangle {

    private int width;
    private int height;

    public ExRectangle(int width,  int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ExRectangle{" +
            "width=" + width +
            ", height=" + height +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this != o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExRectangle that = (ExRectangle) o;
        return width == that.width && height == that.height;
    }

}
