package p1;

interface Lockable {
    /** establishes the key used to unlock. 
     * @param key used to lock and unlock 
     */
    void setKey(int key);
    
    /** locks the implementing object if the correct key is
    provided and returns true if the object was locked.
    * @param key used to lock and unlock
    * @return true if locked*/
    boolean lock(int key);
    
    /** unlocks the implementing object if the correct key is
    provided and returns true if the object was unlocked. 
    * @param key used to lock and unlock
    * @return true if unlocked*/
    boolean unlock(int key);
    
    /** returns true if the implementing object is locked.. 
     * @return true if locked*/
    boolean locked(); 

}
