package com.lara;

import java.io.BufferedReader;
import java.io.FileReader;

public class D {
	public static void main(String[] args) {
		try (FileReader fin = new FileReader("amit.text");
				BufferedReader bin = new BufferedReader(fin)) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
