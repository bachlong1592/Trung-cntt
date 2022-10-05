package Shape;

public class Retangle extends Shape{
    double width;
    double length;

    public Retangle(String name, double witdth, double length){
        super(name);
        this.width = witdth;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return this.width*this.length;
    }
}