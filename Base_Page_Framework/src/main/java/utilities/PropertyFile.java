package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static Properties p;
	
	public static FileInputStream fi;
	
	public static Properties GetPropertyObject() {
		
		try {
			if(p==null) {
			fi = new FileInputStream(System.getProperty("user.dir")+"/Configuration.properties");
			p = new Properties();
			
			p.load(fi);
			}
			
			
		} catch (IOException fnfe) {
			fnfe.printStackTrace();
		}
		return p;
		
	}
	
	
	
}
