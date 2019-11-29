import com.sun.media.sound.WaveFileReader;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


import javax.sound.sampled.*;
import java.applet.AudioClip;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.io.*;
import java.net.URLConnection;

public class MyThread extends Thread {

    @Override
    public void run(){
        try {


           ServerSocket s = new ServerSocket(25599);

           Socket c = s.accept();
            boolean a = true;
           File f = new File("C:/Users/rasah_s2z0ncs/Desktop/CwBw/abc.mp3");
            FileOutputStream fileOutputStream = new FileOutputStream(f);


           while (true) {

               fileOutputStream.write(c.getInputStream().read());



           }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
