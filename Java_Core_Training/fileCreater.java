import java.io.*;
public class fileCreater{
	public static void main(String[] args){
		try {
			for (int i = 1; i <= 11; i++){
				if (new File("D6T1Q"+i+".java").createNewFile()){
					System.out.println("New File is created!");  
				} else {  
					System.out.println("File already exists.");  
				}  
			}
			
		}
		catch (IOException io){
			System.out.println("IOException occured"); 
		}
	}
}