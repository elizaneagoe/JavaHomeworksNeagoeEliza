package Exceptions;

import java.io.IOException;

public class TestFileManagement {
	public static void main(String[] args) {
		FilesManagement manager = new FilesManagement();
		String file = "e:\\diverse\\a.txt";
		try {
			String content = "abc";
			manager.writeFileContent(file, content);			
			
			String existingContent = manager.readFileContent(file);
			if (content.equals(existingContent)) {
				System.out.println("Write completed succesfuly");
				System.out.println("Read completed succesfuly");
			} else {
				System.out.println("Error in file content!");
			}
			
			String appendedContent = "def";
			manager.appendStringToFile(file, appendedContent);
			existingContent = manager.readFileContent(file);
			if ((content + appendedContent).equals(existingContent)) {
				System.out.println("Append completed succesfuly");
			} else {
				System.out.println("Error in appended file content!");
			}
			
			manager.deleteFileContent(file);
			existingContent = manager.readFileContent(file);
			if (existingContent.equals("")) {
				System.out.println("Delete content completed succesfuly");
			} else {
				System.out.println("Error in deleted file content!");
			}
			
		} catch (IOException ioe) {
			System.out.println("Error occured " + ioe.getMessage());
		}
	}
}
