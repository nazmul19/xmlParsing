package df.parse.impl;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;

import org.apache.commons.digester.Digester;

import df.parse.RateListParse;
import df.pojo.RateEntry;
import df.pojo.RateList;
import df.pojo.RateMonth;

/**
 * 
 * @author Nazmul.Hassan	
 */

public class RateListParseImpl implements RateListParse {
	public static Digester digester;
	@SuppressWarnings("finally")
	public RateList doParsing(String  rateListXml) {
		// TODO Auto-generated method stub
		RateList rateList=null;
		try {
			 digester = new Digester();
	         digester.setValidating( false );

	         digester.addObjectCreate( "RateList", RateList.class);

	         digester.addObjectCreate( "RateList/month", RateMonth.class);
	         digester.addSetProperties( "RateList/month", "date", "monthYear" );
	         
	         	digester.addObjectCreate( "RateList/month/Entry", RateEntry.class);
	         	
	         		digester.addBeanPropertySetter( "RateList/month/Entry/id", "id" );
	         		digester.addBeanPropertySetter( "RateList/month/Entry/roleName", "roleName" );
	         		digester.addBeanPropertySetter( "RateList/month/Entry/type", "type" );
	         		digester.addBeanPropertySetter( "RateList/month/Entry/billingType", "billingType" );
	         		digester.addBeanPropertySetter( "RateList/month/Entry/billingUnits", "billingUnits" );
	         		digester.addBeanPropertySetter( "RateList/month/Entry/UnitRate", "unitRate" );
	         		digester.addBeanPropertySetter( "RateList/month/Entry/FinalRate", "finalRate" );
	         	
	         	digester.addSetNext( "RateList/month/Entry", "addEntry" );	
	         
	         digester.addSetNext( "RateList/month", "addRateMonth" );
	         //File inputFile = new File( args[0] );
	         Reader reader = new StringReader(rateListXml);
	         rateList = (RateList) digester.parse(reader);
	         //RateList rateList = (RateList) digester.parse( inputFile );
//	         for(RateMonth rm:rateList.getMonthlyRates()){
//	        	 System.out.println("Month=:"+rm.getMonthYear());
//	        	 for(RateEntry re:rm.getEntries()){
//	        		 System.out.println(re.getRoleName());
//	        	 }
//	         }
	         return rateList;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			return rateList;
		}
	}
	
	public static void main(String[] args) {
		RateListParseImpl obj = new RateListParseImpl();
		File f=new File("D:\\spring learn\\parsing\\src\\main\\resources\\ratelist.xml");
		//obj.doParsing(f);
	}
}
