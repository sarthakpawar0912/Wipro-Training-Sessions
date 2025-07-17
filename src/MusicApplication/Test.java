package MusicApplication;

public class Test {

    public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable playableVeena = veena;
        Playable playableSaxophone = saxophone;

        playableVeena.play();
        playableSaxophone.play();
    }

}