import java.io.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Test1 {
    public static void main(String args[]){
        try(BufferedReader in = new BufferedReader(new FileReader("/Users/kowreesh/IdeaProjects/Test1/employees.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
                String[] tokens = str.split(",");
                String name;
                name = tokens[1]+tokens[2];
                String des = tokens[5].substring(0, tokens[5].length() - 1);
                if(des.equalsIgnoreCase(" DEV")) {
//                    System.out.println(name);
                    try {
                        File file = new File("/Users/kowreesh/IdeaProjects/Test1/dev.txt");
                        boolean fvar = file.createNewFile();
                            System.out.println("hello");
                            FileWriter fw = new FileWriter(file,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            String val = tokens[0]+","+des+"\n";
                            bw.write(val);
                            bw.close();
                    } catch (IOException e) {
                        System.out.println("Exception Occurred:");
                        e.printStackTrace();
                    }
                }
                if(des.equalsIgnoreCase(" QA")) {
                    try {
                        File file = new File("/Users/kowreesh/IdeaProjects/Test1/qa.txt");
                        boolean fvar = file.createNewFile();

                            FileWriter fw = new FileWriter(file,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            String val = tokens[0]+","+des+"\n";
                            bw.write(val);
                            bw.close();
                    } catch (IOException e) {
                        System.out.println("Exception Occurred:");
                        e.printStackTrace();
                    }
                }
                if(des.equalsIgnoreCase(" MANAGER")) {
                    try {
                        File file = new File("/Users/kowreesh/IdeaProjects/Test1/manager.txt");
                        boolean fvar = file.createNewFile();

                            FileWriter fw = new FileWriter(file,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            String val = tokens[0]+","+des+"\n";
                            bw.write(val);
                            bw.close();

                    } catch (IOException e) {
                        System.out.println("Exception Occurred:");
                        e.printStackTrace();
                    }
                }
            }

        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }
    }
}
