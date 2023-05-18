package lt.bit.qs.data;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "part")
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpart;
    private String drawing;
    private String partname;
    @ManyToOne
    @JoinColumn(name = "revision")
    private Revision revision;

    public Part() {
    }

    public Part(Integer idpart, String drawing, String partname, Revision revision) {
        this.idpart = idpart;
        this.drawing = drawing;
        this.partname = partname;
        this.revision = revision;
    }

    public Integer getIdpart() {
        return idpart;
    }

    public void setIdpart(Integer idpart) {
        this.idpart = idpart;
    }

    public String getDrawing() {
        return drawing;
    }

    public void setDrawing(String drawing) {
        this.drawing = drawing;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public Revision getRevision() {
        return revision;
    }

    public void setRevision(Revision revision) {
        this.revision = revision;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.idpart);
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
        final Part other = (Part) obj;
        return Objects.equals(this.idpart, other.idpart);
    }

    @Override
    public String toString() {
        return "Part{" + "idpart=" + idpart + ", drawing=" + drawing + ", partname=" + partname + ", revision=" + revision + '}';
    }

    
    
    

}
