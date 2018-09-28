public class TriangleV2 {

    //DEFINIUJĘ METODĘ

    public boolean isRightTriangle(Triangle triangle) {
        double aSqr = Math.pow(triangle.getA(), 2);
        double bSqr = Math.pow(triangle.getB(), 2);
        double cSqr = Math.pow(triangle.getC(), 2);

        //DEFINIUJĘ ZAŁOŻENIA

        if (aSqr == bSqr + cSqr || bSqr == aSqr + cSqr || cSqr == aSqr + bSqr) {
            return true;
        } else {
            return false;
        }

    }
}
