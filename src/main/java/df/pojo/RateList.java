package df.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Nazmul.Hassan	
 */

public class RateList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<RateMonth> monthlyRates =new ArrayList<RateMonth>();

	public void addRateMonth( RateMonth rm ) {
		monthlyRates.add( rm );
	}
	public List<RateMonth> getMonthlyRates() {
		return monthlyRates;
	}

	public void setMonthlyRates(List<RateMonth> monthlyRates) {
		this.monthlyRates = monthlyRates;
	}
	
	

}
