package com.srg.mains;

import com.srg.entities.VehicleEntity;
import com.srg.repository.VehicleRepository;

public class MainApplication {
	
	public static void main(String[] args) {
		VehicleEntity vehicleEntity = new VehicleEntity();
		vehicleEntity.setVin("UYT6559546");
		vehicleEntity.setMake("TOYOTA");
		vehicleEntity.setModel("PRIYUS");
		vehicleEntity.setYear(2013);
		vehicleEntity.setType("SUV");

		
		VehicleRepository vehicleRepository = new VehicleRepository();
		vehicleRepository.save(vehicleEntity);
	}

}
