package br.com.portfolio.graphql.input;

import graphql.schema.GraphQLInputType;

public class PetInput implements GraphQLInputType{

	private String name;
	private Long ownerId;
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
}
