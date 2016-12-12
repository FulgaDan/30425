package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public abstract class Mammal extends Animal {
	
	public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	float normalBodyTemp;
	float percBodyHair;
	
	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}
	
	public void setPercBodyHair(float percBodyHair)  {
		this.percBodyHair = percBodyHair;
	}
	
	public float setPercBodyHair() {
		return this.percBodyHair;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
	}
	public void decodeFromXml(Element element) {
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
