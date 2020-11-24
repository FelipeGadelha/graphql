package br.com.portfolio.graphql.resolver;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.portfolio.graphql.input.PetInput;
import br.com.portfolio.graphql.model.Person;
import br.com.portfolio.graphql.model.Pet;
import br.com.portfolio.graphql.repository.PersonRepository;
import br.com.portfolio.graphql.repository.PetRepository;

@Component
public class PetResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private PetRepository repository;
	
	@Autowired
	private PersonRepository personRepository;
	
	public Collection<Pet>findAllPets(){
		return repository.findAll();
	}
	
	public Pet savePet(PetInput input) {
		Person owner = personRepository.findById(input.getOwnerId()).get();
		return repository.save(new Pet(input.getName(), owner));
	}
	
	
	
	
}
