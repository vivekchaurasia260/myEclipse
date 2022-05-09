package com.vivekrest.test.helper;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	// This is the static way of giving path..and the image will upload on given path
	
	// public final String UPLOAD_DIR="C:\\SpringBoot_workspace\\bootrestapibook\\src\\main\\resources\\static\\image";
	
	
	// by doing this way we can give dynamic path to upload folder from server.
	public final String UPLOAD_DIR= new ClassPathResource("static/image/").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException {
		
	}
	
	public boolean uploadFile(MultipartFile file) {
		
		boolean f=false;
		
		try {
			// This is old way to reading and writing file...
//			InputStream is = file.getInputStream();
//			byte data[] = new byte[is.available()];
//			is.read(data);
//			
//			// write
//			FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+File.separator+file.getOriginalFilename());
//			fos.write(data);
//			
//			fos.flush();
//			fos.close();
			
			Files.copy(file.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			f=true;
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
		return f;
	}

}
