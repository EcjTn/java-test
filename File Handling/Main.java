import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] names = {"Ecj", "Roxanne", "Kali", "Darlene"};
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Successfully registered!");



            for(String name : names){
                writer.write("\n" + name);
                System.out.println("[+] Wrote: " + name + " Successfully!");
            }
            writer.close();


            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            
            String lines;
            while((lines = reader.readLine()) != null) {
                System.out.println("Reading: " + lines);
            }


        }
        catch(IOException e) {
            e.printStackTrace();




        }
    }
}


