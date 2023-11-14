package com.ice.designed.pattem.structural.adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放 mp3 文件 : " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType, fileName);
        }
    }
}
