package br.com.portfolio.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portfolio.graphql.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{

}
