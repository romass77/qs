package lt.bit.qs.data;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idreport;
    private Integer reportnumber;

    @ManyToOne
    @JoinColumn(name = "part")
    private Part part;
     
    private String ponumber;
    @Temporal(TemporalType.DATE)
    private Date date;
    private Integer quantaty;
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "supplier")
    private Supplier supplier;

    public Report() {
    }

    public Report(Integer idreport, Integer reportnumber, Part part, String ponumber, Date date, Integer quantaty, User user, Supplier supplier) {
        this.idreport = idreport;
        this.reportnumber = reportnumber;
        this.part = part;
        this.ponumber = ponumber;
        this.date = date;
        this.quantaty = quantaty;
        this.user = user;
        this.supplier = supplier;
    }

    public Integer getIdreport() {
        return idreport;
    }

    public void setIdreport(Integer idreport) {
        this.idreport = idreport;
    }

    public Integer getReportnumber() {
        return reportnumber;
    }

    public void setReportnumber(Integer reportnumber) {
        this.reportnumber = reportnumber;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public String getPonumber() {
        return ponumber;
    }

    public void setPonumber(String ponumber) {
        this.ponumber = ponumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getQuantaty() {
        return quantaty;
    }

    public void setQuantaty(Integer quantaty) {
        this.quantaty = quantaty;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idreport);
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
        final Report other = (Report) obj;
        return Objects.equals(this.idreport, other.idreport);
    }

    @Override
    public String toString() {
        return "Report{" + "idreport=" + idreport + ", reportnumber=" + reportnumber + ", part=" + part + ", ponumber=" + ponumber + ", date=" + date + ", quantaty=" + quantaty + ", user=" + user + ", supplier=" + supplier + '}';
    }



  
}
