import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.File;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
public class Main {


    public static void main(String[] args) throws IOException, UnsupportedAudioFileException {
        URL conn = new URL("http://streams.ilovemusic.de/iloveradio6.mp3");

        OutputStream out = new FileOutputStream(new File("C:/Users/rasah_s2z0ncs/Desktop/CwBw/abc.wav"));
        byte[] buffer = new byte[4096];
        int len;

    File f = new File("C:/Users/rasah_s2z0ncs/Desktop/CwBw/abc.wav");
Thread r = new TThread();
r.start();

        while (true){

            AudioInputStream encodedASI = AudioSystem.getAudioInputStream(AudioFormat.Encoding.PCM_SIGNED,  AudioSystem.getAudioInputStream(conn));
            int i = AudioSystem.write(encodedASI, AudioFileFormat.Type.WAVE, f);
            System.out.println(i);


        }

    }


    private static class TThread extends Thread {
        @Override
        public void run(){

            AudioInputStream fis = null;
            try {
                sleep(1000);
                fis = AudioSystem.getAudioInputStream(new File("C:/Users/rasah_s2z0ncs/Desktop/CwBw/abc.wav"));
                AudioPlayer.player.start(fis);
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }
}
