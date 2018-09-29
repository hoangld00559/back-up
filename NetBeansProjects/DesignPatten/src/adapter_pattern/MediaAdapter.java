/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_pattern;

/**
 *
 * @author MyPC
 */
public class MediaAdapter implements MediaPlayer{
    
    AdvancedMediaPlayer advanceMusicPlayer;
    
    public MediaAdapter(String audiotype){
        if(audiotype.equalsIgnoreCase("vlc")){
            advanceMusicPlayer = new VlcPlayer();
        }else if(audiotype.equalsIgnoreCase("mp4")){
            advanceMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advanceMusicPlayer.playMp4(fileName);
        }
    }
    
}
