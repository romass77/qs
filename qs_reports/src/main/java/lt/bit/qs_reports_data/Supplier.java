
package lt.bit.qs_reports_data;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="supplier")
public class Supplier {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsupplier;
    private String suppliername;

    public Supplier() {
    }

    public Supplier(Integer idsupplier, String suppliername) {
        this.idsupplier = idsupplier;
        this.suppliername = suppliername;
    }

    public Integer getIdsupplier() {
        return idsupplier;
    }

    public void setIdsupplier(Integer idsupplier) {
        this.idsupplier = idsupplier;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idsupplier);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Supplier other = (Supplier) obj;
        return Objects.equals(this.idsupplier, other.idsupplier);
    }

    @Override
    public String toString() {
        return "Supplier{" + "idsupplier=" + idsupplier + ", suppliername=" + suppliername + '}';
    }
    
    
    
}
