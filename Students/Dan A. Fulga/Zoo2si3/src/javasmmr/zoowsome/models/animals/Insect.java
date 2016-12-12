package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public abstract class Insect extends Animal {
	
	
	public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	boolean canFly = false;
	boolean isDangerous = false;
	
	public boolean canFly() {
		if(canFly) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setCanFly(boolean canFly){
		this.canFly = canFly;
	}
	
	public boolean getCanFly() {
		return this.canFly;
	}
	
	public boolean isDangerous() {
		if(isDangerous) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public boolean getIsDangerous() {
		return this.isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.canFly));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}
	
	public void decodeFromXml(Element element) {
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
