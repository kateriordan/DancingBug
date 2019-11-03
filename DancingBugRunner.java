package boxBug;

import info.gridworld.actor.ActorWorld; 
import info.gridworld.grid.Location; 
import info.gridworld.actor.Actor;

import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;

/**
 * This class runs a world that contains dancing bugs. <br /> 
 * This class is not tested on the AP CS A and AB exams. 
 */ 
public class DancingBugRunner 
{ 
    public static void main(String[] args) 
    { 
        ActorWorld world = new ActorWorld(); 
        UnboundedGrid<Actor> uGrid = new UnboundedGrid<>(); 
        world.setGrid(uGrid);

        int[] DancingArray = new int[]{2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10}; 
        DancingBug Jane = new DancingBug(DancingArray); 
        
        int[] DancingArray2= new int[]{4,0,0,0,0,0,0,0,0};
        DancingBug Harriet = new DancingBug(DancingArray2);
        
        int[] DancingArray3= new int[]{2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10};
        DancingBug Abigail = new DancingBug(DancingArray3);
        
        int[] DancingArray4= new int[]{4,0,0,0,0};
        DancingBug RBG = new DancingBug(DancingArray4);
        
        int[] DancingArray5= new int[]{4,0,0};
        DancingBug Rosa = new DancingBug(DancingArray5);
       
        int[] DancingArray6= new int[]{4};
        DancingBug Susan = new DancingBug(DancingArray6);
        
        int[] DancingArray7= new int[]{4,0,0,0,0,0,0};
        DancingBug Clara = new DancingBug(DancingArray7);
        
        int[] DancingArray8= new int[]{4,0,0,0};
        DancingBug Amelia = new DancingBug(DancingArray8);
       
        
        Harriet = new DancingBug(DancingArray2); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(6, 6), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray2); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(6, 8), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray2); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(6, 10), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray7); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(6, 12), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray4); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(6, 14), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray5); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(6, 16), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray6); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(6, 18), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray4); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(6,20), Harriet); 
        
        Harriet = new DancingBug(DancingArray7); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(8,6), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray4); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(10,6), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray5); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(12,6), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
        Harriet = new DancingBug(DancingArray6); 
        Harriet.setColor(Color.BLUE); 
        world.add(new Location(14,6), Harriet); 
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        Harriet.turn();
        
             
        Jane.setColor(Color.RED); 
        world.add(new Location(6, 20), Jane); 
        
        Jane = new DancingBug(DancingArray); 
        Jane.setColor(Color.RED); 
        world.add(new Location(8, 20), Jane);
        
        Jane = new DancingBug(DancingArray); 
        Jane.setColor(Color.RED); 
        world.add(new Location(10, 20), Jane);
        
        Jane = new DancingBug(DancingArray); 
        Jane.setColor(Color.RED); 
        world.add(new Location(12, 20), Jane);
        
        Jane = new DancingBug(DancingArray); 
        Jane.setColor(Color.RED); 
        world.add(new Location(14, 20), Jane);
        
        Abigail = new DancingBug(DancingArray3); 
        Abigail.setColor(Color.RED); 
        world.add(new Location(16, 6), Abigail);
        
        Abigail = new DancingBug(DancingArray3); 
        Abigail.setColor(Color.RED); 
        world.add(new Location(18, 6), Abigail);
       
        Abigail = new DancingBug(DancingArray3); 
        Abigail.setColor(Color.RED); 
        world.add(new Location(20, 6), Abigail);
        
        Abigail = new DancingBug(DancingArray3); 
        Abigail.setColor(Color.RED); 
        world.add(new Location(22, 6), Abigail);
        
        Abigail = new DancingBug(DancingArray3); 
        Abigail.setColor(Color.RED); 
        world.add(new Location(24, 6), Abigail);
        

        world.show(); 
    } 
}