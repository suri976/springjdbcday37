package com.jobiak.ioc;
import java.util.*;
public class Garden {
ArrayList<String> fruits;
ArrayList<String> flowers;
HashSet<String>Trees;
HashMap<String,String>cityFruit;


public Garden() {
	
	// TODO Auto-generated constructor stub
}

public Garden(ArrayList<String> fruits) {
	
	this.fruits = fruits;
}

public ArrayList<String> getFruits() {
	return fruits;
}

public void setFruits(ArrayList<String> fruits) {
	System.out.println("set called...........");
	this.fruits = fruits;
}

public void setFlowers(ArrayList<String> flowers) {
	System.out.println("set called...........");
	this.flowers = flowers;
}

public void setcityFruit(HashMap<String,String> cityFruit) {
	System.out.println("set called...........");
	this.cityFruit = cityFruit;
}


public HashSet<String> getTrees() {
	return Trees;
}

public void setTrees(HashSet<String> trees) {
	Trees = trees;
}

public ArrayList<String> getFlowers() {
	return flowers;
}

public HashMap<String,String> setcityFruit() {
	return cityFruit;
}


public Garden(HashSet<String> trees) {
	super();
	Trees = trees;
}

@Override
public String toString() {
	return "Garden [fruits=" + fruits + ", flowers=" + flowers + ", Trees=" + Trees + ", cityFruit=" + cityFruit + "]";
}





	
	
	
}
