package ch15_stream.others_1025;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// C:\JAVA_workspace\FileTest : 절대경로, 여기가 파일 서버 역할
		// . 닷은 현재위치, ./ : 현재 폴더를 기준으로 하위 
		// .. 부모 폴더 : 상대경로
//		File file = new File("C:\\Temp\\newFile.txt");
//		File file = new File("C:\\Java_Workspace\\Java_EX\\src\\ch15_stream\\others_1025\\newFile.txt");
//		File file = new File("C:\\JAVA_workspace\\FileTest\\newFile.txt");
		File file = new File("C:\\temp\\upload\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		//file.delete();
		
		
		
		
		
		
		
		
		
		
	}
}
