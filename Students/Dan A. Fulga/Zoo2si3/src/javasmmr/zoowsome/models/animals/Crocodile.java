package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Crocodile extends Reptile {
	
	public Crocodile(String name, int nrOfLegs, boolean laysEggs,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setLaysEggs(laysEggs);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	
	public Crocodile() {
		super(6.5,0.85);
		this.setLaysEggs(true);
		this.setName("Crocodile");
		this.setNrOfLegs(4);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Crocodile);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
