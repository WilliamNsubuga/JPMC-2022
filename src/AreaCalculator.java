public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1.0, 5.0));
    }
    public static double area(double radius){
        if(radius >=0){
            double area = Math.PI * radius * radius;
            return area;
        }
        return -1.0;
    }
    public static double area(double x,  double y){
        if(x >= 0 && y >= 0){
            return  x * y;
        }
        return -1.0;
    }
}
