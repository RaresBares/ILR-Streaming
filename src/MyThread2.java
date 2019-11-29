import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.sound.sampled.AudioSystem;
import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class MyThread2 extends Thread {

    @Override
    public void run(){

        try {

            sleep(1000);

            URLConnection conn = new URL("http://streams.ilovemusic.de/iloveradio6.mp3").openConnection();
            InputStream is = conn.getInputStream();
            OutputStream out = new FileOutputStream(new File("C:/Users/rasah_s2z0ncs/Desktop/CwBw/abc.mp3"));
            byte[] buffer = new byte[4096];
            int len;



            AudioPlayer.player.start(new AudioStream(new FileInputStream("C:/Users/rasah_s2z0ncs/Desktop/CwBw/abc.mp3")));

            while ((len =is.read(buffer)) > 0){



                out.write(buffer);
                System.out.println(len);


            }






        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
