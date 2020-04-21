package com.company;

public class Schauspieler {

    private String vorname;
    private String nachname;
    private String spitzname;
    private String geburtsort;
    private String geburtsdatum;
    private String nationalitaet;
    private double groesse;

    public String get_Vorname()
    {
        return this.vorname;
    }

    public void set_Vorname(String vorname)
    {
        this.vorname = vorname;
    }

    public String get_Nachname()
    {
        return this.nachname;
    }

    public void set_Nachname(String nachname)
    {
        this.nachname = nachname;
    }

    public String get_Spitzname()
    {
        return this.spitzname;
    }

    public void set_Spitzname(String spitzname)
    {
        this.spitzname = spitzname;
    }

    public String get_Geburtsort()
    {
        return this.geburtsort;
    }

    public void set_Geburtsort(String geburtsort)
    {
        this.geburtsort = geburtsort;
    }

    public String get_Geburtsdatum()
    {
        return this.geburtsdatum;
    }

    public void set_Geburtsdatum(String geburtsdatum)
    {
        this.geburtsdatum = geburtsdatum;
    }

    public String get_Nationalitaet()
    {
        return this.nationalitaet;
    }

    public void set_Nationalitaet(String nationalitaet)
    {
        this.nationalitaet = nationalitaet;
    }

    public double get_Groesse()
    {
        return this.groesse;
    }

    public void set_Groesse(double groesse)
    {
        this.groesse = groesse;
    }


    public Schauspieler()
    {
        this("", "", "", "", "", "", 0);
    }

    public Schauspieler(String vorname, String nachname)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.spitzname = "";
        this.geburtsort = "";
        this.geburtsdatum = "";
        this.nationalitaet = "";
        this.groesse = 0;
    }

    public Schauspieler(String vorname, String nachname, String spitzname, double groesse)
    {
        this.vorname = nachname;
        this.nachname = nachname;
        this.spitzname = spitzname;
        this.geburtsort = "";
        this.geburtsdatum = "";
        this.nationalitaet = "";
        this.groesse = groesse;
    }

    public Schauspieler(String vorname, String nachname, String spitzname, String geburtsort, String geburtsdatum, String nationalitaet, double groesse)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.spitzname = spitzname;
        this.geburtsort = geburtsort;
        this.geburtsdatum = geburtsdatum;
        this.nationalitaet = nationalitaet;
        this.groesse = groesse;
    }
}
