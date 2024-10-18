import java.io.FileReader; 
import java.io.IOException; 
public class Practical28 { 
public static void main(String[] args) throws IOException { 
char findChar = args[0].charAt(0); 
int ch;
int count = 0; 
FileReader f = new FileReader("File.txt"); 
while((ch=f.read()) != -1) { 
if(findChar == ((char)ch)) 
count++; 
} 
f.close(); 
System.out.println(findChar + " ouccurs " + count + " times."); 
} 
} 