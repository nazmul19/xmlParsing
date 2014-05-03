package df.parse.impl;

import java.util.List;





import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import df.mumoment.pojo.RateListCutomDomain;
import df.mumoment.pojo.RateListDomin;
import df.pojo.RateEntry;
import df.pojo.RateList;
import df.pojo.RateMonth;

/**
 * 
 * @author Nazmul.Hassan	
 */

public class TestRateListParse {

	public static void main(String[] args) {
		RateListParseImpl ratelistParseImpl = new RateListParseImpl();
		
		Transaction tx = null;
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().addAnnotatedClass(RateListDomin.class).
				addAnnotatedClass(RateListCutomDomain.class).
				buildSessionFactory();
		Session session = factory.openSession();
		try {
			tx = session.beginTransaction();
			
			  @SuppressWarnings("unchecked")
			List<RateListCutomDomain> ratelistCustomList = (List<RateListCutomDomain>) 
					  session.createQuery("from RateListCutomDomain").list();
			 for(RateListCutomDomain rctm:ratelistCustomList){
				 if(rctm.getRatelist_c() !=null && rctm.getRatelist_c() !=""){
					 System.out.println("RateList ID=:"+rctm.getId_c());
					 RateList r = ratelistParseImpl.doParsing(rctm.getRatelist_c());
					 if(r !=null){
						 for(RateMonth rm:r.getMonthlyRates()){
							 if(rm.getMonthYear() !=null)
								 System.out.println("Month=:"+rm.getMonthYear());
							 if(rm.getEntries() !=null) {
								 for(RateEntry re:rm.getEntries()){
					        		 if(re.getRoleName() !=null){
					        			 System.out.println(re.getRoleName());
					        		 }
					        	 } 
							 }
				         } 
					 } 
				 }
			 } 
			tx.commit();
		}
		 catch(Exception e){
			 System.out.println(e);
		 } 
		finally {
			session.close();
		}
	}

}
