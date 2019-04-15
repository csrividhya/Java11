package main.java.lambdasAndStreams;

import java.util.*;

import java.util.Arrays;

class Flower{
int sepalLength;
String name;

public Flower(int sepalLength, String name){
    this.sepalLength=sepalLength;
    this.name=name;
}

public Flower(){
}
}

class sortHelper implements Comparator<Flower>{
    public int compare(Flower a,Flower b){
        return b.sepalLength-a.sepalLength; //desc order
    }
}
public class sort{
    public static void main(String...args) {
    
        Flower aFlower = new Flower(10, "lotus");
        Flower bFlower = new Flower(4,"tulip");

        Flower[] flowers = new Flower[]{aFlower,bFlower};
        System.out.println(Arrays.asList(flowers));
        Arrays.sort(flowers, new sortHelper());
        System.out.println(Arrays.asList(flowers));

        
    }
}