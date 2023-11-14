package com.ice.designed.pattem.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 vlc 文件 : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
