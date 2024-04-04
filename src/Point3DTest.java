public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(5.6f, 8.6f,9.8f);
        float[] coordinate = point3D.getXYZ();
        System.out.println(coordinate);
    }
}
