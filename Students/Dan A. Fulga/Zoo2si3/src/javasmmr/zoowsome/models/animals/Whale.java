package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Whale extends Aquatic {
	
	public Whale(int avgSwimDepth, waterType waterType, String name, int nrOfLegs,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
	}
	
	public Whale() {
		super(8,0.4);
		this.setAvgSwimDepth(80);
		this.setName("Whale");
		this.setWaterType(waterType.saltWater);
		this.setNrOfLegs(0);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Whale);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
