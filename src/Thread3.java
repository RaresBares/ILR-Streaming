import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.*;

public class Thread3 extends Thread {

    @Override
    public void run(){



        try {
         sleep(3000);
            InputStream ab = new FileInputStream("C:/Users/rasah_s2z0ncs/Desktop/CwBw/abc.mp3");
         AudioStream a = new AudioStream(ab);
        AudioStream ai = new AudioStream(a);
        AudioPlayer.player.start(ai);

    } catch (Exception e) {
        e.printStackTrace();
    }
    }

}
