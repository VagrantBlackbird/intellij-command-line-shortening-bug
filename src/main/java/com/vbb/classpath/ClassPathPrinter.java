package com.vbb.classpath;

public class ClassPathPrinter {
	
	public static void main(String[] args) {
		String classpath = System.getProperty("java.class.path");
		System.out.println("CLASSPATH LENGTH: " + classpath.length());
		
		if (classpath.contains("\\\\")) {
			int indexAtDoubleSlash = classpath.indexOf("\\\\");
			String partOfClassPathWithDoubleSlash = classpath.substring(indexAtDoubleSlash - 20, indexAtDoubleSlash + 20);
			
			throw new IllegalStateException("Classpath contains double slashes: invalid part is: \n" + partOfClassPathWithDoubleSlash);
		}
	}
}
