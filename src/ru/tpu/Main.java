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

    public static class A{
        public static <T> T indentify(T t) {
            return t;
        };
    };

    public static void main(String[] args) throws IOException {
        CharsetDecoder decoder = Charset.forName("Cp1251").newDecoder();
        FileInputStream report = new FileInputStream(new File("d:\\temp\\rep1.dat"));
        InputStreamReader fileReader = new InputStreamReader(report,decoder);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Pattern pattern = Pattern.compile("([A-Za-zА-Яа-я0-9.()/ ]*)[\\s-]*([\\s\\S]*)");
        String line;
            while ((line = bufferedReader.readLine())!=null){
                Matcher matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        //System.out.println(matcher.group(1).trim());
                        if (matcher.group(1).contains("Альтитуда ротора (hр.)")) {
                            System.out.println(Double.parseDouble(matcher.group(2).trim()));
                        }
                    }
            }

        int y = 0;

        System.out.println(y+++"");
        System.out.println("a" + --y);
        class B extends A{};
        class C extends B{};


        A al = new C();





        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        //System.out.println(stream.limit(1).collect(Collectors.joining()));
        System.out.println(stream.limit(3).map(x-> x + "2").collect(Collectors.joining()));

    }

}
