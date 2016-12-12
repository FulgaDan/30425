package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	
	public Animal getAnimal (String type ) {
		
		if(Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale();
		}
		
		else if(Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		}
		
		else if(Constants.Animals.Aquatics.Jellyfish.equals(type)) {
			return new Jellyfish();
		}
		else throw new RuntimeException("Couldnt do it!");
		
	}
}
