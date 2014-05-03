package df.mumoment.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Nazmul.Hassan	
 */
@Entity
@Table(name="df_contract_cstm")
public class RateListCutomDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private String id_c;
	
	@Column(name = "ratelist_c")
	private String ratelist_c;

	public String getId_c() {
		return id_c;
	}

	public void setId_c(String id_c) {
		this.id_c = id_c;
	}

	public String getRatelist_c() {
		return ratelist_c;
	}

	public void setRatelist_c(String ratelist_c) {
		this.ratelist_c = ratelist_c;
	}
	
	
}
