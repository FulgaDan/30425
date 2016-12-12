package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Alligator extends Reptile {
	
	public Alligator(String name, int nrOfLegs, boolean laysEggs,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setLaysEggs(laysEggs);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	
	public Alligator() {
		super(5,0.7);
		this.setLaysEggs(true);
		this.setName("Alligator");
		this.setNrOfLegs(4);

	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Alligator);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
