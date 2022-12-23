package ca.bcit.comp1510.lab05;

/** Cube.
 * @author vhmai
 * @version 2022
 *
 */
public class Cube {
    
    /** value of X-coordinate. */
    private double x;
    
    /** value of Y-coordinate. */
    private double y;
    
    /** value of Z-coordinate. */
    private double z;
    
    /** value of edge length. */
    private double a;
    
    /**
     * Constructs a Cube object by defining 
     * its X-coordinate, Y-coordinate, Z-coordinate and edge length.
     * @param x for x-coordinate
     * @param y for Y-coordinate
     * @param z for z-coordinate
     * @param a for edge length
     */
    public Cube(double x, double y, double z, double a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
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
    public double getA() {
        return a;
    }
    
    /** Setter for edge length.
     * @param a edge length
     */
    public void setA(double a) {
        this.a = a;
    }
    
    /** returns a string composed of the concatenation of the cube's info. 
     * @return cube info
     */
    public String toString() {
        return ("" + x + y + z);
    }
    
    /** calculate cube's surface area.
     * @return surface area*/
    public double surfaceArea() {
        double s = (2 + 2 + 2) * a * a;
        return s;
    }
    
    /** calculate cube's volume.
     * @return volume
     */
    public double volume() {
        double v = a * a * a;
        return v;
    }
    
    /** calculate  cube's face diagonal.
     * @return face diagonal
     */
    public double facediagonal() {
        double fd = Math.sqrt(2) * a;
        return fd;
    }
    
    /** calculate  cube's space diagonal.
     * @return face diagonal
     */
    public double spacediagonal() {
        double sd = Math.sqrt(2 + 1) * a;
        return sd;
    }
    

}
