package com.example.demo.components.song;

import lombok.*;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

enum Genre {
  CLASSICAL,
  ROCK,
  POP,
  RAP,

}
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "songs")
public class Song {

//  @AutoValue
//  @GeneratedValue(strategy = GenerationType.AUTO)  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private String _id;
  private String title;
  private String artist;
  private Genre genre;
  private int length;
  private float price;

  public Song(String title, String artist, Genre genre, int length, float price) {
    this.title = title;
    this.artist = artist;
    this.genre = genre;
    this.length = length;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Song{" + "id=" + this._id + ", title='" + this.title + '\'' + ", artist='" + this.artist + '\'' + ", genre='"
        + this.genre + ", length='" + this.length + ", price='" + this.price + '}';
  }
}
