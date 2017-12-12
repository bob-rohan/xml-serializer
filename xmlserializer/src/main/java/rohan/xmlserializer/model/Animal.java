package rohan.xmlserializer.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "animalType")
@JsonSubTypes({ @JsonSubTypes.Type(name = "CAT", value = Cat.class),
		@JsonSubTypes.Type(name = "DOG", value = Dog.class) })
public class Animal {

	private AnimalType animalType;

	public AnimalType getAnimalType() {
		return animalType;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

}
