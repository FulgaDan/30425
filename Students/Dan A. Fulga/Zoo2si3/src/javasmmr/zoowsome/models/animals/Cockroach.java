package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Cockroach extends Insect {
	
	public Cockroach(boolean canFly, boolean isDangerous, String name, int nrOfLegs,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	
	public Cockroach() {
		super(1.25,0.25);
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setNrOfLegs(8);
		this.setName("Cockroach");
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
