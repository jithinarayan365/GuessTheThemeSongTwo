package com.sololaunches.www.wweguessthethemetwo;

/**
 * Created by hp on 25-03-2018.
 */

public class WWEConstants {

   static String MAIN_WWE_TABLE = "CREATE TABLE WWE_STAGE_MAIN ( MAIN_ID INTEGER PRIMARY KEY,PLAYER TEXT,ALIAS TEXT,PATH TEXT,DISPLAY_NAME TEXT,HINT TEXT,HINT_STATUS TEXT,AD_STATUS TEXT,STATUS TEXT,TRIVIA TEXT);";
    static String MAIN_PLAYER    = "CREATE TABLE WWE_PLAYER_STAT (PLAYER_ID INTEGER PRIMARY KEY,PLAYER_NAME TEXT,COINS INTEGER,POINTS INTEGER,STATUS TEXT);";
}
