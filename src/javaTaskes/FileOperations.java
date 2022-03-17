package javaTaskes;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperations {
public static void main(String[] args) throws IOException {
	File f = new File ("C:\\Users\\andre\\Downloads\\Manual Testing ANd Java notes By Merin\\Add\\Sub");
	// For Create Folder With in the folder
	boolean a = f.mkdirs();
	System.out.println(a);
	File f1 = new File ("C:\\Users\\andre\\Downloads\\Manual Testing ANd Java notes By Merin\\Add\\Sub\\ vimal.txt");
	boolean b = f1.createNewFile();
	System.out.println(b);
	// to write
	FileUtils.write(f1, "I AM VIMAL");
	// to read
	List<String> readLines = FileUtils.readLines(f1);
	for (String s : readLines) {
System.out.println(s);	

	}
	
	
}
}
