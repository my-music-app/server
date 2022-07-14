package com.example.demo.components.song;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface songRepository  extends MongoRepository<Song, String> {
    public List<Song> findByArtist(String artist);

}
