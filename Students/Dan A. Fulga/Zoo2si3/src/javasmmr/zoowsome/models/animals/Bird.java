package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public abstract class Bird extends Animal {


	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	boolean migrates = false;
	int avgFlightAltitude;
	
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public int getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
	public boolean migrates(){
		if(migrates) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	
	public boolean getMigrates() {
		return this.migrates;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}
	public void decodeFromXml(Element element) {
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}

