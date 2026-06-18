import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        try {
            File inputFile = new File("students.txt");
            Scanner sc = new Scanner(inputFile);

            FileWriter fw = new FileWriter("reportcard.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(" ");

                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double average = (m1 + m2 + m3) / 3.0;

                bw.write("Name: " + name);
                bw.newLine();
                bw.write("Average: " + average);
                bw.newLine();
                bw.write("--------------------");
                bw.newLine();
            }

            sc.close();
            bw.close();

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }
    }
}