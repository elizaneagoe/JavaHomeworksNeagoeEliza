package Exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesManagement {

	public void writeFileContent(String file, String content) throws IOException {
		writeStringToFile(file, content, false);
	}
	
	public void deleteFileContent(String file) throws IOException {
		writeStringToFile(file, "", false);
	}
	
	public void appendStringToFile(String file, String content) throws IOException {
		writeStringToFile(file, content, true);
	}
	
	public String readFileContent(String file) throws IOException {
		BufferedReader reader  = null;
		String content = "";		
		try {
			reader = createReader(file);
			String line = "";
			while ((line = reader.readLine()) != null) {
				content += line;
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		return content;
	}
	
	private void writeStringToFile(String file, String content, boolean append) throws IOException {
		BufferedWriter writer = null;
		try {
			writer = createWriter(file, append);
			writer.write(content);
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}
	
	private BufferedWriter createWriter(String file, boolean append) throws IOException {
		return new BufferedWriter(new FileWriter(file, append));
	}
	
	private BufferedReader createReader(String file) throws IOException {
		return new BufferedReader(new FileReader(file));
	}
}
