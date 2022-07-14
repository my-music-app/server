package com.example.demo.components.song;

import java.util.List;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class songServiceImp implements songService {
    @Autowired
    private final songRepository repo;

    @Override
    public List<Song> findAll() {
        return repo.findAll();
    }
    @Override
    public Song addSong(Song s) {
        return repo.save(s);
    }
    @Override
    public Song getById(String id){
        return  repo.findById(id).orElse(null);
    }
    @Override
    public List<Song> getByArtist(String artist){
        return repo.findByArtist(artist);
    }
    @Override
    public Song updateSong(Song updetedSong){
            repo.save(updetedSong);
            return updetedSong;
    }

    @Override
    public void deleteSong(String id){
         repo.deleteById(id);
    }
}