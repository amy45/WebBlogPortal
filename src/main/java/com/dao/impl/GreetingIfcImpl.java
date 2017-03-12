package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.GreetingIfc;
import com.data.GreetingData;


@Repository
public class GreetingIfcImpl implements GreetingIfc {

	
	


	@Override
	public List<GreetingData> getData(GreetingData e) {
		// TODO Auto-generated method stub
		
		
		 List<GreetingData> recordList =new ArrayList<GreetingData>();
		
		 //GreetingData gd=new GreetingData();
		
		 
		recordList.add(0,e);
		
		return recordList;
	}
}
