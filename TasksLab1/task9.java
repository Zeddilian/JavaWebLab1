package TasksLab1;

import java.util.ArrayList;

public class task9 {
    public static void main(String[] args){
        Bucket myBucket = new Bucket();
        myBucket.BallsInBucket = new ArrayList<Ball>();
        myBucket.BallsInBucket.add(new Ball("red", 12));
        myBucket.BallsInBucket.add(new Ball("blue", 13));
        myBucket.BallsInBucket.add(new Ball("blue", 8));
        myBucket.BallsInBucket.add(new Ball("yellow", 25));
        myBucket.BallsInBucket.add(new Ball("grey", 6));
        myBucket.BallsInBucket.add(new Ball("blue", 15));
        int BlueCounter = 0;
        int WeightOfAll = 0;
        for(Ball OneBall : myBucket.BallsInBucket){
            if (OneBall.colour == "blue")
                BlueCounter++;
            WeightOfAll += OneBall.weight;
        }
        System.out.println("Number of blue balls - "+BlueCounter+", bucket weight - "+WeightOfAll);
    }

    static class Bucket{
        ArrayList<Ball> BallsInBucket;
    }

    static class Ball{
        String colour;
        int weight;
        public Ball(String _colour, int _weight){
            colour = _colour;
            weight = _weight;
        }
    }
}

