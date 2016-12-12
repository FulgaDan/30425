package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Shark extends Aquatic {
	
	public Shark(String name, int nrOfLegs, int avgSwimDepth, waterType waterType, double maintenanceCost, double dangerPerc ) {
		super(maintenanceCost, dangerPerc);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
	}
	
	public Shark() {
		super(7,0.9);
		this.setAvgSwimDepth(50);
		this.setWaterType(waterType.saltWater);
		this.setName("Shark");
		this.setNrOfLegs(0);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
