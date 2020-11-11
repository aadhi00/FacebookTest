package org.failed;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AnnoTrans implements IAnnotationTransformer{

	public void transform(ITestAnnotation b, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer r = b.getRetryAnalyzer();
		if(r==null) {
			b.setRetryAnalyzer(RerunAuto.class);
		}
		
	}

}
