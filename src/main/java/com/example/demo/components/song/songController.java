package com.example.demo.components.song;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("song")
public class songController {

    @Autowired
    private songService service;
//    @Autowired
//    private resType resType;

//    public songController() {
//        this.resType=new resType();
//    }

    @GetMapping("")
    public List<Song> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Song getOne(@PathVariable String id){
        return service.getById(id);
    }

    @GetMapping("/byArtist/{artist}")
    public List<Song> getByArtist(@PathVariable String artist){
        return service.getByArtist(artist);
    }
    @PostMapping("")
    public Song add(@RequestBody Song newSong) {
        return service.addSong(newSong);
    }

    @PutMapping("")
    public Song update(@RequestBody Song updetedSong){
        return service.updateSong(updetedSong);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        service.deleteSong(id);
        return "Deleted Succecfuly";
    }



}
