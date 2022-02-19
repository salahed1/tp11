package ma.cigma.pfe.service;
import ma.cigma.pfe.dao.iclientdao;
import ma.cigma.pfe.models.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class serviceimpl implements iclientservice {

	
		@Autowired
		private iclientdao dao;
		@Override
		@Transactional
		public client save(client clt) {
		return dao.save(clt);
		}
		@Override
		@Transactional
		public client modify(client newClt) {
		client oldClt = dao.findById( newClt).getId()).get();
		oldClt.setName(newClt.getName());
		return dao.save(oldClt);
		}
		@Override
		@Transactional
		public void remove(long idClt) {
		dao.deleteById(idClt);
		}
		@Override
		public Client getOne(long idClt) {
		return dao.findById(idClt).get();
		}
		@Override
		public List<Client> getAll() {
		return (List<Client>) dao.findAll();
		}

}
