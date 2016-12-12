package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}	
	int avgSwimDepth;
	private waterType waterType;
	enum waterType {saltWater, freshWater};
	
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public void setWaterType(waterType waterType) {
		this.waterType = waterType;
	}
	
	public waterType getWaterType() {
		return this.waterType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter, "waterType", String.valueOf(this.waterType));
	}
	public void decodeFromXml(Element element) {
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(waterType.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
