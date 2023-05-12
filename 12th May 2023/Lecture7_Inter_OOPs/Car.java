package FairWork.Lecture7_Inter_OOPs;

public class Car {
    private MusicSystem ms;

    public void setMusicSystem(MusicSystem obj){
        ms = obj;
    }

    void startACar(){

    }

    void increaseSpeed(){

    }

    void applyBrakes(){

    }

    void playASong(){
        if(ms == null) {
            System.out.println("No music system installed");
            return;
        }
        ms.play();
    }

    void pauseTheSong(){
        if(ms == null) {
            System.out.println("No music system installed");
            return;
        }

        ms.pause();
    }

    void forwardTheSong(int duration){
        if(ms == null) {
            System.out.println("No music system installed");
            return;
        }

        ms.forward(duration);
    }

    void rewindTheSong(int duration){
        if(ms == null) {
            System.out.println("No music system installed");
            return;
        }

        ms.rewind(duration);
    }

    void setVolumeOfSong(int level){
        if(ms == null) {
            System.out.println("No music system installed");
            return;
        }

        ms.setVolume(level);
    }
}
