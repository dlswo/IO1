package org.letter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class TrailerDownloader {


    // bad code
    public static void main(String[] args)throws Exception {

        String path = "https://cdn.videofarm.daum.net/vod/v95938e81Q3HaVBFFKDBa1B/mp4_1280_720_2M/movie.mp4?px-time=1534828395&px-hash=6560ad285ef207854e46adb785204bad&px-bps=2950105&px-bufahead=10";

        URL url = new URL(path);
        InputStream in = url.openStream();
        OutputStream out = new FileOutputStream("c:\\zzz\\copy.mp4");

        byte[] buffer = new byte[1024*8];

        long start = System.currentTimeMillis();
        //read write
        while(true) {
            int count = in.read(buffer);
            System.out.println("COUNT: " + count);
            if(count == -1){ break; }
            out.write(buffer,0,count); // 0번째부터 카운트까지 씀.
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start); // 걸린 시간을 출력!

        in.close();  //close를 해줘야 메모리 할당된것을 풀어줌.
        out.close();

    }
}
