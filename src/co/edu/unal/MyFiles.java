package co.edu.unal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class MyFiles {
	private String path;
	private String content;
	private File file;
	
	public MyFiles(String path, String content, File file) throws IOException{
		this.path = path;
		this.content = content;
		this.file = file;
		FileUtils.writeStringToFile(file, content);
		
	}
	
	public String getPath() {
		return path;
	}

	public String getContent() throws IOException {
		content = FileUtils.readFileToString(file);
		return content;
	}

	public void addContent(String content) throws IOException {
		String contentTmp = FileUtils.readFileToString(file);
		FileUtils.writeStringToFile(file, contentTmp+content);
		this.content = contentTmp+content;
	}

	public File getFile() {
		return file;
	}	

}
