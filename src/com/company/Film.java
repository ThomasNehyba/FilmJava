package com.company;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private String titel;
    private int erscheinungsjahr;
    private String genre;
    private int laufzeit;
    private List<Schauspieler> cast;
    private String sprache;
    private int FSK;

    public String get_Titel()
    {
        return this.titel;
    }

    public void set_Titel(String titel)
    {
        this.titel = titel;
    }

    public int get_Erscheinungsjahr()
    {
        return this.erscheinungsjahr;
    }

    public void set_Erscheinungsjahr(int erscheinungsjahr)
    {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String get_Genre()
    {
        return this.genre;
    }

    public void set_Genre(String genre)
    {
        this.genre = genre;
    }

    public int get_Laufzeit()
    {
        return this.laufzeit;
    }

    public void set_Laufzeit(int laufzeit)
    {
        this.laufzeit = laufzeit;
    }

    public List<Schauspieler> get_Cast()
    {
        return this.cast;
    }

    public void set_Cast(List<Schauspieler> cast)
    {

        this.cast = cast;

    }

    public String get_Sprache()
    {
        return this.sprache;
    }

    public void set_Sprache(String sprache)
    {
        this.sprache = sprache;
    }

    public int get_FSK()
    {
        return this.FSK;
    }

    public void set_FSK(int FSK)
    {
        this.FSK = FSK;
    }



    public Film()
    {
        this("", 0, "", 0, new ArrayList<>(), "", 0);
    }

    public Film(String titel, int erscheinungsjahr)
    {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        new ArrayList<>();
    }

    public Film(String titel, int erscheinungsjahr, String genre, int laufzeit)
    {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.genre = genre;
        this.laufzeit = laufzeit;
        new ArrayList<>();
    }

    public Film(String titel, int erscheinungsjahr, String genre, int laufzeit, List<Schauspieler> cast, String sprache, int FSK)
    {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.genre = genre;
        this.laufzeit = laufzeit;
        this.cast = cast;
        this.sprache = sprache;
        this.FSK = FSK;
    }
    
}
