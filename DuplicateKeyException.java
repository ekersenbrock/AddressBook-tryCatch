
/**
 * Exercise 14.34
 * New exeption to be used when there is an attempt to duplicate information.
 *
 * @author Erik K
 * @version 5/25/2020
 */
public class DuplicateKeyException extends Exception
{
    // The duplicate key.
    private String key;
    
    /**
     * Store the details in error.
     * @param key The key containing duplicate information.
     */
    public DuplicateKeyException(String key)
    {
        this.key = key;
    }
    
    /**
     * @return The key in error.
     */
    public String getKey()
    {
        return key;
    }
    
    /**
     * @return A diagnostic string containing the key in error.
     */
    public String toString()
    {
        return "Dupliate key Exception: " + key + " is already in use.";
    }
}
