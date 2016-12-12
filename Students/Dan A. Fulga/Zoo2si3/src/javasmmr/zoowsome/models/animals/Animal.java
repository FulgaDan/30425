package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Animal implements Killer, XML_Parsable{
	
	int nrOfLegs;
	String name;
	double maintenanceCost; //i had to remove the final to create the setters
	double dangerPerc;
	boolean takenCareOf = false;
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	
	public Animal(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	public void setNrOfLegs(int nrOfLegs){
		this.nrOfLegs = nrOfLegs;
	}
	
	public int getNrOfLegs() {
		return this.nrOfLegs;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean kill() {
		if(Math.random() < dangerPerc) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}
	
	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	public double getDangerPerc() {
		return this.dangerPerc;
	}
	
	public void setMaintenanceCost(double maintenanceCost){
		this.maintenanceCost = maintenanceCost;
	}
	
	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}

	public void decodeFromXml(Element element){
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}
