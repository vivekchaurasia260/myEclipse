package com.enquero.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperations {

	
	public static void main(String args[]) {

        String fileName = "C:\\Users\\SanGamer\\eclipse-workspace\\Java8\\resources\\numbers.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

	
       try( Stream<String> stream = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("numbers.txt"))).lines()) {
    	   stream.forEach(System.out::println);
       } catch (Exception e) {
           e.printStackTrace();
       }

       
       try (Stream<Path> stream = Files.find(Paths.get("Folder 1"), 5,
               (path, attr) -> path.getFileName().toString().equals("Myfile.txt") )) {
           System.out.println(stream.findAny().isPresent());
       } catch (IOException e) {
           e.printStackTrace();
   }
	
	}
	
	public Set listFilesUsingFilesList(String dir) throws IOException {
	    
	
		return	Files.list(Paths.get(dir)).filter(file -> !Files.isDirectory(file)).map(Path::getFileName).map(Path::toString).collect(Collectors.toSet());
		
	
	}
	
	public static List<Path> findByFileName(Path path, String fileName)
            throws IOException {

        List<Path> result;
        try (Stream<Path> pathStream = Files.find(path,
                Integer.MAX_VALUE,
                (p, basicFileAttributes) ->
                        p.getFileName().toString().equalsIgnoreCase(fileName))
        ) {
            result = pathStream.collect(Collectors.toList());
        }
        return result;

    }
	
	
	
	
}
