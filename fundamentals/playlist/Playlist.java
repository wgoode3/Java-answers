import java.util.HashMap;
import java.util.Iterator;

public class Playlist {
    public static void main(String[] args) {
       
        // Create a trackList of type HashMap

        HashMap<String, String> tracklist = new HashMap<String, String>();
        
        // Add in at least 4 songs that are stored by title

        /*
        Anime - Initial D
        Song - Deja Vu
        Artist - Super Eurobeat - Dave Rodgers
        https://www.youtube.com/watch?v=dv13gl0a-FA
        */

        tracklist.put("Deja Vu", "See your body into the moonlight\nEven if I try to cancel\nAll the pictures into the mind\nThere's a flashing in my eyes\n\nDon't you see my commission, the nation\nHas gone running again\nCan't you see now, illusions\nRight into your mind\n\nDeja vu\nI've just been in this place before\nHigher on the street\nAnd I know it's my time to go\nCalling you, and the search is a mystery\nStanding on my feet\nIt's so hard when I try to be me, woah\nDeja vu\nI've just been in this time before\nHigher on the beat\nAnd I know it's a place to go\nCalling you and the search is a mystery\nStanding on my feet\nIt's so hard when I try to be me, yeah");
        
        /*
         Beautiful Trick 
         アルバム：Flower Flag 
         ボーカル：Vivienne 
         サークル：FELT
        https://www.youtube.com/watch?v=g484x_IUhDE
        */

        tracklist.put("Beautiful Trick", "It is a break of day and morning lights\ndisordered room as ever\nI put on my hat berore going out\nTime to hit the road and I go to meet up with her\n\nShe always praise me and my little hand\nIt makes me feel so lovely\nI don't say much of anything\nbut just that alone is enough for me to believe my life\n\nGive it away, you couldn't say\nand I just believe the way you are\nDreamer dreams, and I ask her why\nCan you know it bring me up my life\n\nThe fate plays a amazing trick on you\nYou can't hold it steady\nI find when the light of fire fall all over the ground.\nThe fate plays a amazing trick on you\nYou can't hold it steady\nSo just I cast a spell perfecty and I say good bye\n\nThe fate plays a beautiful trick");
        
        /*
        Theme of: Utsuho Reiuji
        Song: Solar Sect of Mystic Wisdom-Nuclear Fusion. 
        --NJK Record-- (3L and maria♂polo)
        https://www.youtube.com/watch?v=1vCPxz2gdoQ
        */

        tracklist.put("Warning!", "From out of nowhere, it's coming\nSlowly but surely It drive me crazy\nI've been looking for my only plaything\nDon't you know babe, how much I was starving\n\nCan't you feel the breakneck speed blast?\nBeat my heart bloody fast\nFeel like burning in the artificial sun.\nMeltdown!\n\nWarning!\nWarning!\nRiding through the night\nOh raise your power\nNow's the time to treason\n\nHold me!\nFool me!\nFeel your sexy sigh\nIt's troubling desire\nIn the night of confusion\n\nFeel as the night allows\nNo one to stop the cold\nNow you face the world's wrath\nDown to your mind's meltdown\n\nToo late to turn back, you're my prey\nTake me higher, nobody can stop me\nI'm a ruler, the master of treasure\nYou're a loser, you're just slave of pleasure.\n\nBaby show me your senses tonight\nI just want hold you tight\nFeel like burning in the artificial sun\nMeltdown!\n\nWarning!\nWarning!\nRiding through the night\nOh raise your power\nNow's the time to treason\n\nHold me!\nFool me!\nFeel your sexy sigh\nIt's troubling desire\nIn the night of confusion\n\nFeel as the night allows\nNo one to stop the cold\nNow you face the world's wrath\nDown to your mind's meltdown\n\nI've been looking for my own plaything\nDon't you know babe, how much I was starving\n\nCan't you feel the breakneck speed blast?\nBeat my heart bloody fast\nFeel like burning in the artificial sun\nMeltdown!\n\nWarning!\nWarning!\nRiding through the night\nOh raise your power\nNow's the time to treason\n\nHold me!\nFool me!\nFeel your sexy sigh\nIt's troubling desire\nIn the night of confusion\n\nFeel as the night allows\nNo one to stop the cold\nNow you face the world's wrath\nDown to your mind's meltdown");

        /* 
        ◊ Title： Dream in the Night
        ◊ Vocal： Vivienne
        ◊ Arrangement： Maurits"禅"Cornelis
        ◊ Lyric： Renko
        ◊ Circle： FELT
        ◊ Album： Ground Snow
        https://www.youtube.com/watch?v=XTx6g4OqOZ0
        */

        tracklist.put("Dream in the Night", "The twist of time keeps on guessing 'round me.\nAnd fate keeps knocking at the door,\nExitement on the floor.\n\nGo whoa-oh-oh in the night,\nIt's deep inside.\nI can't resist it.\n\nIt's fight or flight with a new dimension.\nWe think we've got no other choice.\nWe've never been so sure.\n\nI'm set on fire in the sky.\nWithin your eyes,\nLightning strikes my core.\n\nGiving up just to realize\nOur goals had fallen from sight.\nBut even so, it's quite all right and yet\n\nRising up just to be aware.\nWe should have just tried to share\nA world with passion\nIn a way we could seal the despair\n\nBaby, bring it.\nCome and dream it.\nLet's believe it.\nGonna break down the walls here.\n\nCompromising.\nStart deciding.\nReuniting.\nRaise it on high! Oh!\n\nLet's be honest\nYou just want it.\nGet into it.\nAnd my heart's within you.\n\nLet's just do it.\nNothing to it.\nClose and lucid.\nDreaming inside. Ah...");

        // Pull out one of the songs by its track title
        // System.out.println(tracklist.get("Deja Vu"));

        // Print out all the track names and lyrics in the format Track: Lyrics
        int count = 1;
        Iterator it = tracklist.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            System.out.println(String.format("\n\n%d. %s:\n", count++, pair.getKey()));
            System.out.println(pair.getValue());
            it.remove();
        }

    }
}