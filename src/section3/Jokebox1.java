package section3;

import javalearnings.Triangle;

import java.util.*;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.util.ArrayList;

public class Jokebox1 {
    TreeSet<String> songList = new TreeSet<>();

    public TreeSet<String> getSongList(){
        return songList;
    }

    public static void main(String[] args) {
        new Jokebox1().go();
//        Jokebox1 abc = new Jokebox1();
//        abc.addsong("abjhs");
//        abc.addsong("aksjl/ksjs");
//        System.out.println(abc.getSongList());

    }

    public void go(){
        getSongs();
        System.out.println(songList);
    }
    void getSongs(){
        try{
            File file = new File("/Users/apple/IdeaProjects/javaproject/src/section3/Songlist.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line= reader.readLine()) !=null){
                addsong(line);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    void addsong(String lineToParse){
        String [] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }


}
