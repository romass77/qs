package lt.bit.qs.dao;

import lt.bit.qs.data.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDAO extends JpaRepository<Supplier, Integer> {

}
