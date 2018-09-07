//package org.letter;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//public class Main {
//
//
//    // bad code
//    public static void main(String[] args)throws Exception {
//
//        InputStream in = new FileInputStream("C:\\zzz\\sample.txt"); // 다형성 활용
//        OutputStream out = new FileOutputStream("c:\\zzz\\sampleCopy.txt");
//
//        byte[] buffer = new byte[5];
//
//        long start = System.currentTimeMillis();
//        //read write
//        while(true) {
//            int count = in.read(buffer);
//            System.out.println("COUNT: " + count);
//            if(count == -1){ break; }
//            out.write(buffer,0,count); // 0번째부터 카운트까지 씀.
//        }
//        long end = System.currentTimeMillis();
//
//        System.out.println(end - start); // 걸린 시간을 출력!
//
//        in.close();  //close를 해줘야 메모리 할당된것을 풀어줌.
//        out.close();
//
//    }
//}
