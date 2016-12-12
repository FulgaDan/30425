package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal (String type ) {
		
		if(Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();
		}
		
		else if(Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach();
		}
		
		else if(Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		}
		else throw new RuntimeException("Couldnt do it!");
	}
}
