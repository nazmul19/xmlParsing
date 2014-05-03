package df.pojo;

import java.io.Serializable;

/**
 * 
 * @author Nazmul.Hassan	
 */

public class RateEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String roleName;
	
	private String type;
	
	private String billingType;
	
	private Integer billingUnits;
	
	private Double unitRate;
	
	private Double finalRate;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	public Integer getBillingUnits() {
		return billingUnits;
	}

	public void setBillingUnits(Integer billingUnits) {
		this.billingUnits = billingUnits;
	}

	public Double getUnitRate() {
		return unitRate;
	}

	public void setUnitRate(Double unitRate) {
		this.unitRate = unitRate;
	}

	public Double getFinalRate() {
		return finalRate;
	}

	public void setFinalRate(Double finalRate) {
		this.finalRate = finalRate;
	}

	
}
