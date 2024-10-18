import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
public class Practical27 { 
public static void main(String[] args) throws IOException{ 
for(String s : args) { 
FileReader f = new FileReader(s); 
BufferedReader file = new BufferedReader(f); 
int count = 0;
while(file.readLine() != null) 
count++; 
System.out.println("Lines in " + s + " : " + count); 
file.close(); 
} 
} 
} 