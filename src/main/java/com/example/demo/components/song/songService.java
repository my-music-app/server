package com.example.demo.components.song;

import org.bson.types.ObjectId;

import java.util.List;


public interface songService {
    public List<Song> findAll();
    public Song addSong(Song s);
    public Song getById(String id);
    public List<Song> getByArtist(String artist);
    public Song updateSong(Song updetedSong);
    public void deleteSong(String id);
}
