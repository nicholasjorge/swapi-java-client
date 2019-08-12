package com.swapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Created by Oleur on 21/12/2014.
 * Film model represents a Star Wars single film.
 */
public class Film implements Serializable {

    public String title;

    @JsonProperty("episode_id")
    public int episodeId;

    @JsonProperty("opening_crawl")
    public String openingCrawl;

    public String director;
    public String producer;
    public String url;
    public ZonedDateTime created;
    public ZonedDateTime edited;

    @JsonProperty("release_date")
    public LocalDate releaseDate;

    @JsonProperty("species")
    public List<String> speciesUrls;

    @JsonProperty("starships")
    public List<String> starshipsUrls;

    @JsonProperty("vehicles")
    public List<String> vehiclesUrls;

    @JsonProperty("planets")
    public List<String> planetsUrls;

    @JsonProperty("characters")
    public List<String> charactersUrls;
}
