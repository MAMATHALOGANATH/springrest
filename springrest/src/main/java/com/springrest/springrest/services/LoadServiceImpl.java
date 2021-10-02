package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.loads;
@Service

public class LoadServiceImpl implements LoadService {

	List<loads> list;
	
	
	public LoadServiceImpl()
	{
		list= new ArrayList<>();
		list.add(new loads(1,"delhi","jaipur","chemicals","canter",1,100,
				"20/12/2020",003));
		list.add(new loads(2,"bangalore","mumbai","clothes","canter",1,150,
				"11/03/2021",004));
	}
	@Override
	
	
	public List<loads> getLoad() {
		
		return list;
	}
	@Override
	public loads getLoads(long loadId) {
		loads l=null;
		for(loads Loads:list)
		{
			if(Loads.getId()==loadId)
			{
				l=Loads;
				break;
			}
		}
		return l;
	}
	@Override
	public loads addLoad(loads load) {
		list.add(load);
		return load;
	}
	@Override
	public void deleteLoad(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}
	@Override
	public loads  putLoads(long loadId) {
	
		loads l=null;
		for(loads Loads:list)
		{
			if(Loads.getId()==loadId)
			{
				Loads.setLoadingPoint("indore");
				Loads.setUnloadingPoint("mahabaleshwar");
				Loads.setProductType("wood");
				Loads.setTruckType("canter");
				Loads.setNoOfTrucks(1);
				Loads.setWeight(200);
				Loads.setDate("22/1/2021");
				Loads.setShipperId(34);
				l=Loads;
				break;
			}
		}
		return l;
	}
			
		
		
	}
	


