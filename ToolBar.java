package movies;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.JTable;

public class ToolBar {
	 static String Copy(String src) {
		File source = new File(src); 
		return "Copy";
	}
	 
	 
	 static String Cut(String src) {
		 File source = new File(src); 
			return "Cut";
	 }
	 
	 
	 static String copyPath(String src) {
		 String path =src; 
			return "Copy Path";
	 }
	 
	 
	 static String copyFolder(String src) {
		 String path =src; 
			return "Copy Path";
	 }
	 
	 
	 static void Paste(String src, String dest, String choix) {
		 File source = new File(src); 
		 File destination = new File(dest);
		 
		 switch(choix) {
		 	case "Copy":
		 		try {
					Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
		 		break;
		 		
		 	case "Cut":
		 		try {
					Files.move(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
		 		break;
		 		
		 	case "Copy Folder":
		 		try {
					Files.move(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
		 		break;
		 		
		 	case "Cut Folder":
		 		try {
					Files.move(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
		 		break;
		 } 
	 }
	
	
	 static void Delete(String file) {
		 Path f = Path.of(file);
		 try {
			Files.delete(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 static void newFolder(String dir) throws IOException {
		 dir = dir.replace("\\", "/") + "/New folder";
		 File file = new File(dir);
		 file.mkdirs();
	 }
	 
	 
	 static void sellectAll(JTable table){
		 table.selectAll();
	 }
	 
	 
	 static void sortBy(JTable table){
		 table.setAutoCreateRowSorter(false);
	 }

}
