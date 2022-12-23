package ca.bcit.comp1510.lab05;

/** Sphere.
 * @author vhmai
 * @version 2022
 *
 */
public class Sphere {
    
    /** value of X-coordinate. */
    private double x;
    
    /** value of Y-coordinate. */
    private double y;
    
    /** value of Z-coordinate. */
    private double z;
    
    /** value of radius. */
    private double r;
    
    /**
     * Constructs a Sphere object by defining 
     * its X-coordinate, Y-coordinate, Z-coordinate and radius.
     * @param x for x-coordinate
     * @param y for Y-coordinate
     * @param z for z-coordinate
     * @param r for radius
     */
    public Sphere(double x, double y, double z, double r) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }
    
    /** Getter X-coordinate.
     * @return X-coordinate
     */
    public double getX() {
        return x;
    }
    
    /** Setter for X-coordinate.
     * @param x X-coordinate
     */
    
    public void setX(double x) {
        this.x = x;
    }
    
    /** Getter Y-coordinate.
     * @return Y-coordinate
     */
    public double getY() {
        return y;
    }
    
    /** Setter for Y-coordinate.
     * @param y Y-coordinate
     */
    public void setY(double y) {
        this.y = y;
    }
    
    /** Getter Z-coordinate.
     * @return Z-coordinate
     */
    public double getZ() {
        return z;
    }
    
    /** Setter for Z-coordinate.
     * @param z Z-coordinate
     */
    public void setZ(double z) {
        this.z = z;
    }
    
    /** Getter radius.
     * @return radius
     */
    public double getR() {
        return r;
    }
    
    /** Setter for radius.
     * @param r radius
     */
    public void setR(double r) {
        this.r = r;
    }
    
    /** calculate sphere's surface area.
     * @return surface area*/
    public double surfaceArea() {
        double s = (2 + 2) * Math.PI * r * r;
        return s;
    }
    
    /** calculate sphere's volume.
     * @return volume
     */
    public double volume() {
        double v = (2 + 2) / (1 + 2) * Math.PI * Math.pow(r, (2 + 1));
        return v;
    }
    
    /** return all sphere info.
     * @return all sphere info
     */
    public String toString() {
        return (x + " " + y + " " + z + " " + r + " " 
            + surfaceArea() + " " + volume());
    }
        

}
