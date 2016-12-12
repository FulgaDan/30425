package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Jellyfish extends Aquatic {
	
	public Jellyfish(String name, int nrOfLegs, int avgSwimDepth, waterType waterType,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
	}
	
	public Jellyfish() {
		super(1.2,0.25);
		this.setAvgSwimDepth(20);
		this.setName("Jellyfish");
		this.setNrOfLegs(0);
		this.setWaterType(waterType.saltWater);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Jellyfish);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
