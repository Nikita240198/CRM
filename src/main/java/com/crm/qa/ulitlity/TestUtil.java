package com.crm.qa.ulitlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestUtil {

	public static long Page_Load_Timeout = 20;
	public static long Implicit_Wait = 20;
	
	
	public static String TestData_file_Path = "/Users/Mind/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/testdata/BB1 (1).pdf";

	public static void getData() {
		FileInputStream file = null;

		try {
		file = new FileInputStream(TestData_file_Path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
