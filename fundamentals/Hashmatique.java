import java.util.HashMap;

public class Hashmatique {
	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<>();
		trackList.put("song title 1", "lyrics 1");
		trackList.put("song title 2", "lyrics 2");
		trackList.put("song title 3", "lyrics 3");
		trackList.put("song title 4", "lyrics 4");
		String lyrics = trackList.get("song title 2");
		System.out.println(lyrics);
		for (String key : trackList.keySet()) {
    		System.out.println(key + ": " + trackList.get(key));
		}
	}
}