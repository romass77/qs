
package lt.bit.qs.dao;


import lt.bit.qs.data.Report;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReportDAO extends JpaRepository<Report, Integer>{
    
}