
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        
        if(this == obj) {
            return true;
        }
        
        LicensePlate comparedPlate = (LicensePlate) obj;
        
        if(this.country.equals(comparedPlate.country) && this.liNumber.equals(comparedPlate.liNumber)){
            return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = 10;
        hash = 10 * hash + country.hashCode();
        hash = 10 * hash + liNumber.hashCode();
        return hash;
    }

}
