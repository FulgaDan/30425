package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.repositories.AnimalRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.animals.AnimalFactory;
import javasmmr.zoowsome.services.factories.animals.SpeciesFactory;

public class MainController {
	
	public static void main(String[] args) throws XMLStreamException, ParserConfigurationException, SAXException, IOException {
		/*
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("We have an animal with %d legs ! \n" , a1.getNrOfLegs());
		
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Birds.Canary);
		System.out.printf("We have an animal with %d legs ! \n", a2.getNrOfLegs());
		
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Animal a3 = speciesFactory3.getAnimal(Constants.Animals.Insects.Butterfly);
		System.out.printf("this one is just a %s \n " , a3.getName());

		
		
		Animal[] A = new Animal[10];
		A[0] = new Cow();
		A[1] = new Tiger();
		A[3] = new Mockingbird();
		A[4] = new Monkey();
		A[5] = new Jellyfish();
		A[6] = new Shark();
		A[7] = new Snake();
		A[8] = new Penguin();
		A[9] = new Whale();
		
		Caretaker[] C = new Caretaker[5];
		C[0] = new Caretaker("laurentiu",120, false, 22);
		C[1] = new Caretaker("john",130,false,20);
		C[2] = new Caretaker("giuseppe",140,false,20);
		C[3] = new Caretaker("leontin",120,false,40);
		C[4] = new Caretaker("bernard",200,false,30);
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j<= 10; j++) {
				if((C[i].getIsDead() == false) && (A[j].getTakenCareOf() == false)) {
					String result = C[i].takeCareOf(A[j]);
					if(result.equals(Constants.Caretakers.TCO_KILLED)){
						System.out.println("Unfortunately, the caretaker got himself killed");
							if(result.equals(Constants.Caretakers.TCO_NO_TIME)) {
								System.out.println("no time");
							}
						else {
							A[j].setTakenCareOf(true);
							System.out.println("The animal named " + A[j].getName() + " is with" + C[i].getName());
						}
						
					}
				}
			}
		}
		*/
		
		AnimalRepository anRep=new AnimalRepository();
		ArrayList<Animal> arrayList1=new ArrayList<Animal>();
		Tiger Tiger = new Tiger();
		arrayList1.add(Tiger);
		anRep.save(arrayList1);
		anRep.load();
		
		Jellyfish Jellyfish = new Jellyfish();
		arrayList1.add(Jellyfish);
		anRep.save(arrayList1);
		anRep.load();
		
		AnimalRepository anRep2 = new AnimalRepository();
		ArrayList<Animal> arrayList2 = new ArrayList<Animal>();
		Whale Whale = new Whale();
		arrayList2.add(Whale);
		anRep2.save(arrayList2);
		anRep2.load();
}
	

	
}
