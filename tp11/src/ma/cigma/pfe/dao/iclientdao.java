package ma.cigma.pfe.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import ma.cigma.pfe.models.client;
@Repository
public class iclientdao extends CrudRepository<client,Long> {

	public boolean save(client c) ;
    client update(client c);
    boolean deleteById(long idClient);
    client findById(long idClient);
    List<client> findAll();
    List<client> findByName(String name) {
		return null;
	}
}
 