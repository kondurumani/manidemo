import java.io.*;
public class CopyFile {
public static void main(String[] args)throws Exception {

		int i;
		FileInputStream fin=new FileInputStream("Desktop://a.txt");
				
	FileOutputStream fout=new FileOutputStream("Desktop://b.txt");
	
	do {
		i=fin.read();
		if(i!=-1)fout.write(i);
	}
	while (i!=-1);
	fin.close();
				
	}
}