package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.controllers.Constants;

public class Cow extends Mammal {
	
	public Cow(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair,double maintenanceCost, double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
	public Cow() {
		super(1,0.75);
		this.setName("Cow");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(36);
		this.setPercBodyHair(70);
		}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cow);
	}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}