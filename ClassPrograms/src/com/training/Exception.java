/*
 * package com.training;
 * 
 * import java.io.File; import java.io.FileNotFoundException; import
 * java.io.FileReader; import java.io.IOException; import java.util.ArrayList;
 * import java.util.List;
 * 
 * public class Exception extends RuntimeException{
 * 
 * Exception() { super(); }
 * 
 * 
 * static void getInfo() throws
 * FileNotFoundException,IOException,NullPointerException { FileReader reader =
 * null;
 * 
 * if(reader == null) throw new NullPointerException("file is not found");
 * 
 * try { reader = new FileReader(new File("text.txt"));
 * 
 * reader.read(); } catch (FileNotFoundException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } catch (IOException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } finally { try {
 * reader.close(); } catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } }
 * 
 * 
 * 
 * List<String> myList = new ArrayList<>();
 * 
 * myList.add("arjun"); myList.add(null); myList.add("bindu");
 * 
 * try { for(String s : myList) { if(s.contains("r")) System.out.println(s); } }
 * catch(NullPointerException ex) { ex.printStackTrace(); }
 * catch(RuntimeException ex) { ex.printStackTrace(); }
 * 
 * System.out.println("outside try"); }
 * 
 * 
 * public static void main(String[] args) {
 * 
 * Exception.getInfo();
 * 
 * String str = null; if(str.charAt(0) == 'c') { System.out.println(str); }
 * 
 * System.out.println(str.charAt(0));
 * 
 * }
 * 
 * }
 */