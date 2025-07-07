package exception;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        System.out.println("File : " + file.getName());
        System.out.println("File: " + file.isFile());

        try {
            Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // 자원 해제
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
