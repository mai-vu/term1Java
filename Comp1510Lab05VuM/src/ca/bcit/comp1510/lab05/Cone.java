package ca.bcit.comp1510.lab05;

/** Cone.
 * @author vhmai
 * @version 2022
 */

public class Cone {
    
    /** value of cone's height.*/
    private double h;
    
    /** value of cone's radius. */
    private double r;
    
    /**
     * Constructs a Cone object by defining 
     * its height and radius.
     * @param h for height
     * @param r for radius
     */
    public Cone(double h, double r) {
        this.h = h;
        this.r = r;
    }
    
    /** Getter height.
     * @return height
     */
    public double getH() {
        return h;
    }
    
    /** Setter for height.
     * @param h height
     */
    public void setH(double h) {
        this.h = h;
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
    
    /** calculcate cone's voulume.
     * @return v volume
     */
    public double volume() {
        double v = 1.0 / (2 + 1) * Math.PI * r * r * h;
        return v;
    }
    
    /** calculate slant height of cone.
     * @return sh slant height
     */
    public double sh() {
        double sh = Math.sqrt(r * r + h * h);
        return sh;
    }
    
    /** calculate cone's surface area.
     * @return s surface area
     */
    public double surfaceArea() {
        double s = Math.PI * r * (r + sh());
        return s;
    }
    
    /** return all cone info.
     * @return all cone info
     */
    public String toString() {
        return (h + "" + r + " "  + volume() + " " + sh() 
            + " " +  surfaceArea());
    }

}
