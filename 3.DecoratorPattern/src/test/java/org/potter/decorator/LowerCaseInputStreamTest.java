package org.potter.decorator;

import org.junit.Test;

import java.io.*;

public class LowerCaseInputStreamTest {

    //    @Test
//    public void test(){
//        try {
//            LowerCaseInputStreamTest in = new LowerCaseInputStreamTest(new BufferedInputStream(new FileInputStream("")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\workspace\\github\\HeadFirst\\3.DecoratorPattern\\src\\main\\resource\\test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char)c);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
