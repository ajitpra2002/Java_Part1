package com.lara;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class B
{
	public static void main(String[] args)
	{
		File f = new File("amit.text");
		
		FileWriter fw = null;
		try
		{
			fw = new FileWriter(f);
			fw.write("lara technology");
			fw.write("btm");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fw!=null)
				{
					fw.flush();
					fw.close();
					fw = null;
				}
			} 
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
