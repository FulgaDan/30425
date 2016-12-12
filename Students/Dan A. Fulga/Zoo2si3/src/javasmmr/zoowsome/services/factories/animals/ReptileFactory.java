package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.animals.Animal;

public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal (String type ) {
		
		if(Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		}
		
		else if(Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile();
		}
		
		else if(Constants.Animals.Reptiles.Alligator.equals(type)) {
			return new Alligator();
		}
		
		else throw new RuntimeException("Couldnt do it");
	}
	
}
