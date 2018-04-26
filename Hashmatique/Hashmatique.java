import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;

public class Hashmatique{
    public void trackList(){
    HashMap<String, String> tracks = new HashMap<>();
    tracks.put("TitleOne", "Lyrics for the song with TitleOne");
    tracks.put("TitleTwo", "Lyrics for the song with TitleTwo");
    tracks.put("TitleThree", "Lyrics for the song with TitleThree");
    tracks.put("TitleFour", "Lyrics for the song with TitleFour");
    tracks.put("TitleFive", "Lyrics for the song with TitleFive");
    tracks.put("TitleSix", "Lyrics for the song with TitleSix");
    System.out.println(tracks.get("TitleFour"));
    System.out.println(tracks);
    }
}