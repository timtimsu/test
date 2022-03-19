package ru.tpu;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {



    public static void main(String[] args) throws IOException {
        CharsetDecoder decoder = Charset.forName("Cp1251").newDecoder();
        FileInputStream report = new FileInputStream(new File("d:\\temp\\rep1.dat"));
        InputStreamReader fileReader = new InputStreamReader(report, decoder);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Pattern pattern = Pattern.compile("([A-Za-zА-Яа-я0-9.()/ ]*)[\\s-]*([\\s\\S]*)");
        String line;
            while ((line = bufferedReader.readLine())!=null){
                //System.out.println(line);
                Matcher matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        System.out.println(matcher.group(1).trim() + " " + matcher.group(2).trim());
                        if (matcher.group(1).contains("Альтитуда ротора (hр.)")) {
                            System.out.println(Double.parseDouble(matcher.group(2).trim()));
                        }
                    }
            }


    }

}
