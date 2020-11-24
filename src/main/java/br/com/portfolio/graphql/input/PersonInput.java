package br.com.portfolio.graphql.input;

import br.com.portfolio.graphql.model.Gender;
import graphql.schema.GraphQLInputType;

public class PersonInput implements GraphQLInputType{

	private String name;
	private Integer age;
	private Gender gender;
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
}
