package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal (String type ) {
		
		if(Constants.Animals.Birds.Mockingbird.equals(type)) {
			return new Mockingbird();
		}
		
		else if(Constants.Animals.Birds.Canary.equals(type)) {
			return new Canary();
		}
		
		else if(Constants.Animals.Birds.Penguin.equals(type)) {
			return new Penguin();
		}
		else throw new RuntimeException("Couldnt do it!");
	}
}
