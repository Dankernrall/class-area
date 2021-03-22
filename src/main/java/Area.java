public class Area {
    static double getArea(double radius) {
        if (radius <1){return 0;}
        else{
        double first = Math.PI * Math.pow(radius, 2);
        double result = Math.floor(first*100)/100;
        return first;}
    }

    static double getArea(int width, int length) {
        if (width < 1 | length < 1){return 0;}
        else{
        double first = width * length;
        double result = Math.floor(first*100)/100;
        return result;}
    }

    static double getArea(double radius, double height) {
            if (radius <1 | height < 1){return 0;}
            else{
        double first = 2 * Math.PI * radius * (radius + height);
        double result = Math.floor(first*100)/100;
        return result;}
    }

    public static void main(String[] args) {
        System.out.printf("%6.2f\n", Area.getArea(10.0));
        System.out.printf("%6.2f\n", Area.getArea(15, 25));
        System.out.printf("%6.2f\n", Area.getArea(12.0, 17.0));

    }

}
