package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class dataFetch {
	
	static Properties odata = new Properties();
	static Properties vdata = new Properties();
	
	public static void prop(){
		
		try {
			odata.load(new FileInputStream("dataObject.properties"));
			vdata.load(new FileInputStream("dataValue.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getdataValue(String dvalue){
		return vdata.getProperty(dvalue);
	}
	
	public static String getobjectValue(String ovalue){
		return odata.getProperty(ovalue);
	}
}
