package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Ex07 {

	public static void main(String[] args) {
		// Object stream
//		String obj=new String("java Object");
		
//		Vector obj2=new Vector();
//		obj2.add(1234);
//		obj2.add(3.14);
//		obj2.add(false);
//		obj2.add("이상을 출력");
//		
//		ArrayList obj=new ArrayList<>();
//		obj.add(4321);
//		obj.add("잘들어감");
//		obj.add(obj2);
		
		Car obj=new Car();
		
		String path="test03.bin";
		File file=new File(path);
		
		OutputStream os=null;
		ObjectOutputStream oos=null;
		
		try {
			os=new FileOutputStream(file);
			oos=new ObjectOutputStream(os);
			
			oos.writeObject(obj);
			
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)oos.close();
				if(os!=null)os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}















