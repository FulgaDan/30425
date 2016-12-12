package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Butterfly extends Insect {
	
	public Butterfly(boolean canFly, boolean isDangerous, String name, int nrOfLegs,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	public Butterfly() {
		super(1.2,0.1);
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setName("Butterfly");
		this.setNrOfLegs(6);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
		
	}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
