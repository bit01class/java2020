package com.bit.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Ex08 {

	public static void main(String[] args) {
		String path="test03.bin";
		File file =new File(path);
		
		InputStream is=null;
		ObjectInputStream ois=null;
		
		try {
			is=new FileInputStream(file);
			ois=new ObjectInputStream(is);
			
			Object obj = ois.readObject();
			Car car=(Car) obj;
			System.out.println(car.speed);
			System.out.println(car.color);
			car.func();
			////////////////////////
//			Vector vec = (Vector) obj;
//			Enumeration eles = vec.elements();
//			while(eles.hasMoreElements()){
//				System.out.println(eles.nextElement());
//			}
			////////////////////
//			ArrayList list=(ArrayList) obj;
//			System.out.println(list.get(0));
//			System.out.println(list.get(1));
//			Vector vec2=(Vector) list.get(2);
//			Enumeration enu= vec2.elements();
//			while(enu.hasMoreElements()){
//				System.out.println(enu.nextElement());
//			}
			////////////////////
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(ois!=null)ois.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}












