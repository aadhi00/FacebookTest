package org.failed;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunAuto implements IRetryAnalyzer {
	int min=0,max=10;
	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
