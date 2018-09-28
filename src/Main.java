public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 3, 5);
        TriangleV2 checker = new TriangleV2();
        boolean isRight = checker.isRightTriangle(triangle);
        if (isRight) {
            System.out.println("Trójkąt jest prostokątny");
        } else {
            System.out.println("Trójkąt nie jest prostokątny");
        }
    }
}
