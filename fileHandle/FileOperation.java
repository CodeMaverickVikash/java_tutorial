import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FileOperation {
	public String fileName;

	FileOperation(String fileName) {
		this.fileName = fileName;
	}

	public static void main(String[] args) {
		FileOperation instance = new FileOperation("log.txt");
		instance.makeFile();
		instance.writeOnFile("Content written by java");
		instance.readFile();
		System.out.println(instance.getFileInfo());
		instance.deleteFile();
	}

	/*
	 * File operation performed
	 * Create, Write, Read, Delete, getFileInfo
	 */

	public void makeFile() {
		File f = new File(this.fileName);
		if (!f.exists()) {
			try {
				f.createNewFile();
				System.out.println("File created successfully: " + f.getName());
			} catch (IOException e) {
				System.out.println("An error occurred");
				e.printStackTrace();
			}
		}
	}

	public void writeOnFile(String msg) {
		try {
			FileWriter fw = new FileWriter(this.fileName);
			fw.write(msg);
			fw.close();
			System.out.println("Write operation on file done successfully");
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

	public void readFile() {
		try {
			File f = new File(this.fileName);
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				String data = s.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

	public Map<Object, Object> getFileInfo() {
		// Create a HashMap with Integer keys and String values
		Map<Object, Object> result = new HashMap<>();
		File f = new File(this.fileName);
		if (f.exists()) {
			result.put("fileName", f.getName());
			result.put("absolutePath ", f.getAbsolutePath());
			result.put("writable", f.canWrite());
			result.put("readable", f.canRead());
			result.put("size", f.length());
		} else {
			System.out.println("file does not exist");
		}
		return result;
	}

	public void deleteFile() {
		File f = new File(this.fileName);
		if (f.delete()) {
			System.out.println("File is deleted successfully " + f.getName());
		} else {
			System.out.println("Failed to delete file");
		}
	}

}