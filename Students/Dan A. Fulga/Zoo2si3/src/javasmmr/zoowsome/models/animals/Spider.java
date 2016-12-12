package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Spider extends Insect {
	
	public Spider (boolean canFly, boolean isDangerous, int nrOfLegs, String name,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	
	public Spider() {
		super(1,0.9);
		this.setCanFly(false);
		this.setIsDangerous(true);
		this.setNrOfLegs(8);
		this.setName("Spider");
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Spider);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
	
}
