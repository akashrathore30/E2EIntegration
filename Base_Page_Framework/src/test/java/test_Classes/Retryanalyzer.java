package test_Classes;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyzer implements IRetryAnalyzer {
	int count=0;
	int totoalretry=2;
	static  int n;
	
	static  String Stat1="Java is great. Grails is also great";
	//static String Stat2="I got a red pen";
	
	public boolean retry(ITestResult result) {
		
		
		if(count<totoalretry){
			count++;
			return true;
		}
		return false;
	}
	
	public  void setval(){
		n=10;
	}
	
	public String reverseSentences(String s1){
		String arr[]=s1.split(" ");
		for(int i=arr.length-1; i>=0;i--){
			System.out.println(arr[i]);
		}
		
		return null;
	}
	
public String getuniquerWord(String s1){
	int i;
	int j;
	int counter;
	String finalword="";
	boolean flag=true;
	String array[]=s1.split(" ");
	for(i=0; i<array.length;i++){
		counter=i;
		String value=array[i];
		for(j=0;j<array.length;j++){
			flag=true;
			if(i==j){
				continue;
			}
			
			if(array[i].replace(".", "").equalsIgnoreCase(array[j])){
				flag= false;
				System.out.println("The word"+array[i]+" Is duplicate");
				break;
			}
			
			
		}
		if(flag){
			finalword=finalword+" "+ array[i];
			
		}
	}
	System.out.println(finalword);
	return null;
}
		
		
		
public static void main(String[] args) {
	Retryanalyzer obj = new Retryanalyzer();
	//obj.getuniquerWord(Stat1);
	obj.reverseSentences("I Love My India");
	}
}
