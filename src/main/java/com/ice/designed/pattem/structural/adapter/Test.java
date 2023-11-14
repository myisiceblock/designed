package com.ice.designed.pattem.structural.adapter;

public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","老中医");
        audioPlayer.play("vlc","小苹果.vlc");
        audioPlayer.play("mp4","小苹果.mp4");
    }
}
