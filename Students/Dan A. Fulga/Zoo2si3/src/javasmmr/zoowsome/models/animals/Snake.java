package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Snake extends Reptile {
	
	public Snake(String name, int nrOfLegs, boolean laysEggs,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setLaysEggs(laysEggs);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	
	public Snake() {
		super(3,0.7);
		this.setLaysEggs(true);
		this.setName("Snake");
		this.setNrOfLegs(0);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Snake);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
	
}
