 package test_Classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.IAnnotationTransformer;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;



public class Listeners implements  IAnnotationTransformer {

	
	/*public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		List<IMethodInstance> arrangedmethods= new ArrayList<IMethodInstance>();
		for(IMethodInstance methodname:methods){
			Test m=methodname.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			
			List<String> groupNames= new ArrayList<String>();
			for(String groupvalue:m.groups()){
				groupNames.add(groupvalue);	
			}
			if(m.priority()==1&&groupNames.contains("smoke")){
				arrangedmethods.add(methodname);
			}
		}
		
		return arrangedmethods;
	}*/

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if(testMethod.getName().equalsIgnoreCase("testB")){
			annotation.setPriority(2);
			annotation.setRetryAnalyzer(test_Classes.Retryanalyzer.class);
			String[]grp={"regression"};
			annotation.setGroups(grp);	
		}
		/*if(testMethod.getName().equalsIgnoreCase("testC")){
			annotation.setPriority(1);
			String[]grp={"regression"};
			annotation.setGroups(grp);	
		}
		if(testMethod.getName().equalsIgnoreCase("testD")){
			annotation.setPriority(0);
			String[]grp={"regression","smoke"};
			String[]dep={"testC"};
			annotation.setGroups(grp);	
			
		}*/
		
	}

	



}
