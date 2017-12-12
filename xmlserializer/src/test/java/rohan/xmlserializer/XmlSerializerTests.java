package rohan.xmlserializer;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;

import rohan.xmlserializer.helpers.XmlHelperImpl;
import rohan.xmlserializer.model.Animal;
import rohan.xmlserializer.model.AnimalType;
import rohan.xmlserializer.model.Cat;
import rohan.xmlserializer.model.Dog;

public class XmlSerializerTests {

	@Test
	public void testSerializeCat() {
		Cat cat = new Cat();
		cat.setAnimalType(AnimalType.CAT);
		cat.setCatProperty(true);

		String xml = XmlHelperImpl.getXml(cat);

		assert xml != null;
	}

	@Test
	public void testSerializeResource() {
		Cat cat = new Cat();
		cat.setAnimalType(AnimalType.CAT);
		cat.setCatProperty(true);
		Resource<Cat> resource = new Resource<>(cat);

		String xml = XmlHelperImpl.getXml(resource);

		assert xml != null;
	}
	
	@Test
	public void testSerializeResources(){
		Cat cat = new Cat();
		cat.setAnimalType(AnimalType.CAT);
		cat.setCatProperty(true);
		
		Dog dog = new Dog();
		dog.setAnimalType(AnimalType.DOG);
		dog.setDogProperty(true);
		
		Collection<Animal> animals = new ArrayList<>();
		animals.add(cat);
		animals.add(dog);
		
		Resources<Resource<Animal>> animalResources = Resources.wrap(animals);

		String xml = XmlHelperImpl.getXml(animalResources);

		assert xml != null;
	}

}
