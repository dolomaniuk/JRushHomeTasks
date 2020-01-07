package myTestPacage;

import java.io.*;

public class MyBufferReader {

    public static void main(String[] args) throws IOException {

        //ByteArrayInputStream

        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream bis1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = bis1.read()) != -1)
            System.out.println(b);

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        ByteArrayInputStream bis2 = new ByteArrayInputStream(array2, 6, 5);
        while((b = bis2.read()) != -1)
            System.out.print((char)b);
        System.out.println('\n');
        // we don't need use bis.close() with ByteArrayInputStream

        //BufferedInputStream

        String text1 = "Hello world!";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
        try {
            BufferedInputStream bis = new BufferedInputStream(bais);
            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println('\n');
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //FileInputStream

        try{
            FileInputStream fis = new FileInputStream("E:\\DISTR\\GIT\\JavaTasks\\JavaRushTasks\\1.JavaSyntax\\src\\myTestPacage\\Cat.java");
            System.out.println("File size: " + fis.available() + " bytes");
            int i = -1;
            while((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

}


