package ma.cigma.pfe.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.cigma.pfe.models.client;
import ma.cigma.pfe.service.iclientservice;
@Controller("ctrl1")
public class clientcontroller {
	@Autowired
	private iclientservice service;
	
	public client save(client clt) {
	return service.save(clt);
	}
	public client modify(client clt) {
	return service.modify(clt);
	}
	public void remove(long idClt) {
	service.remove(idClt);
	}
	public client getOne(long idClt) {
	return service.getOne(idClt);
	}
	public List<client> getAll() {
	return service.getAll();
	}
	}

