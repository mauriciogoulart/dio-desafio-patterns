package br.com.mg.diodesafiopatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mg.diodesafiopatterns.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}