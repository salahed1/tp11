package ma.cigma.pfe.service;

import java.util.List;

import ma.cigma.pfe.models.client;
public interface iclientservice {
	client save(client clt);
	client modify(client clt);
	void remove(long idClt);
	client getOne(long idClt);
	List<client> getAll();


}
