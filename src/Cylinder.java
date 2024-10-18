public class Cylinder {
    public static double getArea(int radius, int height)
        double area = getPerimeter(radius) * height + 2 * getBaseArea(radius);
        return area;
    }

    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }
}
