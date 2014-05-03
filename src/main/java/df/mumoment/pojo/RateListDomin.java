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
@Table(name="df_contract")
public class RateListDomin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue 
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "deleted")
	private Boolean deleted;
	
	
}
