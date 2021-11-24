package codewars;

public class Dubstep {
    public static String songDecoder(String song) {
        return song.replaceAll("(WUB)+", " ").strip();
    }
}
