package ru.sbt.io;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("file.txt");
        int read = reader.read();

        Reader r = new StringReader("gsdfgdfgdfgdfgfdgfdsg sgdf gsdf");

        Reader r2 = new BufferedReader(reader, 1024 * 1024);
        int read1 = r2.read();
        r2.read();
        r2.read();

        InputStream in = new ByteArrayInputStream(new byte[]{1,2,3,32,42,12});
        Reader r23 = new BufferedReader(new InputStreamReader(in));
    }
}
