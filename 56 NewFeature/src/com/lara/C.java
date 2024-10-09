package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;

public class C
{
	public static void main(String[] args)
	{
		try(Connection con = DriverManager.getConnection(""))
		{
			System.out.println("Inside try");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
