package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Mockingbird extends Bird {
	
	public Mockingbird (String name, int nrOfLegs, boolean migrates, int avgFlightAltitude,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}
	
	public Mockingbird() {
		super(0.3,0.1);
		this.setAvgFlightAltitude(20);
		this.setMigrates(true);
		this.setNrOfLegs(2);
		this.setName("Mockingbird");
	}	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Mockingbird);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
	
}
