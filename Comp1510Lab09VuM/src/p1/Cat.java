package p1;

/** Create cat objects with name and age.
 * @author Mai Vu
 * @version 2022
 *
 */
public class Cat {
    /** cat's name. */
    private final String name;
    
    /** cat's age. */
    private int age;

    /** Construct a cat object by defining name and age, if no name entered, 
     * default name Cleo is assigned. 
     * @param name cat name
     * @param age cat's age*/   
    public Cat(String name, int age) {        
        this.name = name;
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    
    /** Construct a cat object by defining its age, 
     * default name Cleo is assigned as no name is entered. 
     * @param age cat's age*/ 
    public Cat(int age) {
        this.name = "Cleo";
        this.age = age;
    }

    /** Age getter.
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /** Age setter.
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /** name getter.
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name= " + name + ", age= " + age;
    }

}
