package lt.bit.qs.dao;

import lt.bit.qs.data.Revision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RevisionDAO extends JpaRepository<Revision, Integer> {

}
