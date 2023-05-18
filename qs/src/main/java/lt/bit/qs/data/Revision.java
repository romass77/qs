
package lt.bit.qs.data;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "revision")
public class Revision {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrevision;
    private String revision;

    public Revision() {
    }

    public Revision(Integer idrevision, String revision) {
        this.idrevision = idrevision;
        this.revision = revision;
    }

    public Integer getIdrevision() {
        return idrevision;
    }

    public void setIdrevision(Integer idrevision) {
        this.idrevision = idrevision;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idrevision);
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
        final Revision other = (Revision) obj;
        return Objects.equals(this.idrevision, other.idrevision);
    }

    @Override
    public String toString() {
        return "Revision{" + "idrevision=" + idrevision + ", revision=" + revision + '}';
    }
    
    
}
