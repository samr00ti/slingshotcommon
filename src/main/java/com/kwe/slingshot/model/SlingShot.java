package com.kwe.slingshot.model;

public class SlingShot {

    private String ybranch;
    private String rubberband;
    private String rock;

    public SlingShot(String _ybranch, String _rubber, String _rock){

        ybranch = _ybranch;
        rubberband = _rubber;
        rock = _rock;
    }

    public String toString (){
        return "Ybranch: " + ybranch + ", Rubberband: " + rubberband + ", Rock: "+ rock;
    }
}
