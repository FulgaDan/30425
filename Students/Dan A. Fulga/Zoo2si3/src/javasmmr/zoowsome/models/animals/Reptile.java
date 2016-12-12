package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public abstract class Reptile extends Animal{
	
	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	boolean laysEggs = false;
	
	public boolean laysEggs() {
		if(laysEggs) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
	}
	public void decodeFromXml(Element element) {
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
