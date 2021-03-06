package edu.depaul.x86azul.dataAccess;

import edu.depaul.x86azul.geo.*;


/**
 * @author Youssuf ElKalay
 * 
 */
public class DebrisDTO {

	private DataPersister data = DataPersisterInMemory.getInstance();

	public DebrisDTO() {

	}

	public void addDebris(Debris debris) {
		data.write(debris.getGeoHash(), debris);
	}
	
	public void removeDebris(String geoHash) {
		data.delete(geoHash);
		
	}
	
	public void removeAllDebris() {
		data.deleteAll();
	}
 }
