package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Penguin extends Bird{
	
	public Penguin(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude, double maintenanceCost,double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	
	public Penguin() {
		super(7.5,0.1);
		this.setAvgFlightAltitude(0);
		this.setMigrates(false);
		this.setName("Penguin");
		this.setNrOfLegs(2);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Penguin);
	}
}
