import java.util.Arrays;

public class Point3D extends Point2D {
    float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
