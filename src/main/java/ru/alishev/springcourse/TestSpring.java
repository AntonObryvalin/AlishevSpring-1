package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // Создаем объект ClassPathXmlApplicationContext, который загружает конфигурацию из файла applicationContext.xml.
        // Это файл конфигурации Spring, где указаны бины (объекты), которые нужно создать.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(EnumMusic.CLASSICAL);
        player.playMusic(EnumMusic.ROCK);



//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        context.close();
//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();



//         MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//         MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//         boolean comprasion = firstmusicPlayer == secondmusicPlayer;
//
//        System.out.println(comprasion);
//
//        System.out.println(firstmusicPlayer);
//        System.out.println(secondmusicPlayer);
//
//        firstmusicPlayer.setVolume(10);
//
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondmusicPlayer.getVolume());

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());


    }
}
