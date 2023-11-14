package com.ice.designed.pattem.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 mp4 文件 : " + fileName);
    }
}
