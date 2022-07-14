package edu.pdx.cs410J.teamAwesomeSauce;

public class Robot {
    private static int x;
    private static int y;
    private static int xBounds;
    private static int yBounds;
    private static Direction currDir;


    public Robot(int x, int y, int xb, int yb, Direction cd) {
        this.x = x;
        this.y = y;
        this.xBounds = xb;
        this.yBounds = yb;
        this.currDir = cd;
    }

    public static takeDirections(String directions) {
        char[] charArray = directions.toCharArray();
        for (char dir : charArray) {

        }
    }
}
