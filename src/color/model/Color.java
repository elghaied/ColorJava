package color.model;

public class Color {
    int red;
    int green;
    int blue;
    String HexValue;

    public Color(String hexValue)  throws IllegalArgumentException  {
        HexValue = hexValue;
    }

    public Color(int red, int green, int blue) throws IllegalArgumentException  {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", HexValue='" + HexValue + '\'' +
                '}';
    }
}
