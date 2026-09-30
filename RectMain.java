//WAP to calc the area of rectangle + perimeter also.
public class RectMain {
    public static void main(String[] args){
        Rect r1 = new Rect();
        r1.l = 5;
        r1.b = 4;
        r1.area();
        r1.perimeter();

    }
}
class Rect{
    int l , b;
    void area(){
        System.out.println("Area = "+(l*b));
    }
    void perimeter(){
        System.out.println("Perimeter = "+ (2*(l+b)));;
    }
}
