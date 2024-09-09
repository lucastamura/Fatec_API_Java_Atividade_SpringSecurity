package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Filme;

public interface FilmeRepository extends CrudRepository<Filme, Long> {
    
}
