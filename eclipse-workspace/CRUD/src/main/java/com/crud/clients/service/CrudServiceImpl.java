//package com.crud.clients.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.crud.clients.domain.Client;
//import com.crud.clients.entity.ClientEntity;
//import com.crud.clients.mapper.OrikaMapper;
//import com.crud.clients.repository.CrudRepository;
//
//import ma.glasnost.orika.MapperFacade;
//
//@Component
//public class CrudServiceImpl {
//
//	@Autowired // Inject
//	private CrudRepository repo;
//
//	// Instantiate Orika Mapper (mapper of beans)
//	private MapperFacade facade = new OrikaMapper();
//
//	@Override
//	public List<Client> getClients() {
//		List<ClientEntity> reponseEntity = repo.getClients();
//		List<Client> response = new ArrayList<Client>();
//		// stream - To process collections of objects: for each element(variable) (->)
//		// do that sequence
//		reponseEntity.stream().forEach((clientD) -> {
//			response.add(facade.map(clientD, Client.class)); // Adding every element to domain response
//		});
//		return response;
//	}
//
//	@Override
//	public Client getById(long id) {
//		// Instantiate a client of the entity
//		ClientEntity clientEntity = new ClientEntity();
//		// Instantiate the domain
//		Client clientD = new Client();
//		clientEntity = repo.getById(id);
//		clientD.setId(clientEntity.getId());
//		clientD.setName(clientEntity.getName());
//		clientD.setLastName(clientEntity.getLastName());
//		clientD.setGender(clientEntity.getGender());
//		clientD.setAge(clientEntity.getAge());
//		return clientD;
//	}
//
//	@Override
//	public void createClient(Client client) {
//		ClientEntity clientEntity = new ClientEntity();
//		clientEntity.setName(client.getName());
//		clientEntity.setLastName(client.getLastName());
//		clientEntity.setGender(client.getGender());
//		clientEntity.setAge(client.getAge());
//		repo.createClient(clientEntity);
//	}
//
//	@Override
//	public void deleteById(long id) {
//		repo.deleteById(id);
//	}
//
//	@Override
//	public void updateClient(long id, Client client) {
//		ClientEntity clientEntity = new ClientEntity();
//		clientEntity.setName(client.getName());
//		clientEntity.setLastName(client.getLastName());
//		clientEntity.setGender(client.getGender());
//		clientEntity.setAge(client.getAge());
//		repo.updateClient(clientEntity, id);
//	}
//}