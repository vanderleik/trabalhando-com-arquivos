package exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileEBufferedWriter {
    public static void main(String[] args) {
        String[] lines = new String[] {"Primeira linha de texto", "Segunda linha de texto", "Terceira linha de texto"};
        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
