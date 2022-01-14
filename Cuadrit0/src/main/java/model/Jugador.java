package model;

public class Jugador {
    private final String name;
    private int score;
    private boolean playing;

    //métodos Constructores
    public Jugador(String name){
        this.name=name;
    }
    public Jugador(){
        this.name="null";
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
