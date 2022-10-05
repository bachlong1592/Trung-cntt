package Shape;

public class TestShape {
    public static void main(String[] args){
        Shape s1 = new Retangle("cn1", 30, 90);
        Shape s2 = new Circle("ht1", 45);
        Shape s3 = new Retangle("cn2", 40, 20);
        Shape s4 = new Circle("ht2", 50);
        Shape[] shapeList = {s1, s2, s3, s4};
        for(Shape s:shapeList){
            System.out.println(s + "dien tich: " + s.calculateArea());
        }
    }
}