package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File path=new File(".\\temp");
		path.mkdir();
		File file;
		try {
			file=File.createTempFile("bit", ".txt", path);
			System.out.println(file.exists());
			System.out.println();
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getName()+"颇老积己");
			
					
			System.out.println(file.delete());
			System.out.println(file.getName()+"颇老昏力");
			
			
			
			
			if(path.delete()){
				
			}else{
				String[] sts = path.list();
				for(int i=0; i<sts.length; i++){
					File temp=null;
					temp=new File(path.getPath()+"\\"+sts[i]);
					temp.delete();
				}
				path.delete();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
