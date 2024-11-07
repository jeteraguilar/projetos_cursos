package br.com.project.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.api.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long>{
    
}
