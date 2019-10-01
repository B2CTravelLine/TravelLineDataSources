package com.virtusa.repository;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;

public class BusRepository {
	private static List<Bus> busRepository=
			new ArrayList<Bus>();
	
	static Date date;
	static {
		
		try {
			date = (Date) new SimpleDateFormat("dd/mm/yyyy").parse("10/01/2019");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> time=new ArrayList<String>();
		time.add("11");
		Bus bus=new Bus();
		bus.setBusNo(11);
		bus.setBoardingPoint("Hyderabad");
		bus.setDroppingPoint("Chennai");
		bus.setJourneyDate(date);
		bus.setTime(time);
		busRepository.add(bus);
	}
	public static List<Bus> getBusRepository() {
		return busRepository;
	}
	public static void setBusRepository(List<Bus> busRepository) {
		BusRepository.busRepository = busRepository;
	}
	
}
