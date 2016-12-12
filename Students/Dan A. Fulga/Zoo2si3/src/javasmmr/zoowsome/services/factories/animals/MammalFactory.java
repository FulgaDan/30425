package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory{
	public Animal getAnimal (String type ) {
		
		if(Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		}
		
		else if(Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		}
		
		else if(Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		}
		else throw new RuntimeException("Couldnt do it!");
		
	}
}
