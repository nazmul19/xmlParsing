package df.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Nazmul.Hassan	
 */

public class RateMonth implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String monthYear;
	
	private List<RateEntry> entries =new ArrayList<RateEntry>();

	public void addEntry( RateEntry re ) {
		entries.add( re );
	}
	public String getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	public List<RateEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<RateEntry> entries) {
		this.entries = entries;
	}
	
	
}
