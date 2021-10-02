package com.springrest.springrest.services;
import java.util.List;
import com.springrest.springrest.entities.loads;

public interface LoadService {
	public List<loads> getLoad();
	public loads getLoads(long loadId);
	public loads addLoad(loads load);
	public void deleteLoad(long parseLong);
	public loads putLoads(long loadId);
	
}
