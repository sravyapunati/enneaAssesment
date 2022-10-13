package com.example.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dto.ModelClass;
import com.example.repository.CustomerDTO;

public class serviceImpl {

	@Autowired
	private CustomerDTO customerDTO;
	
	String line = "";
	public void saveData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Sample Inventory.xlsx"));
			while((line = br.readLine()) !=null) {
				String [] data = line.split(",");
				ModelClass modelClass = new ModelClass();
				modelClass.setCode(data[1]);
				modelClass.setName(data[2]);
				modelClass.setBatch(data[3]);
				modelClass.setStock(data[4]);
				modelClass.setDeal(data[5]);
				modelClass.setMrp(data[6]);
				modelClass.setFree(data[7]);
				modelClass.setRate(data[8]);
				modelClass.setExp(data[9]);
				modelClass.setCompany(data[10]);
				modelClass.setSupplier(data[11]);
				
				customerDTO.save(modelClass);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readDataFromExcelSheet() {
		
	}
}
