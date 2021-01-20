package com.vineet.dynamicarrayimplementation;

public class DynamicArray {
	
	private int array[];
	private int count;
	private int size;
	
	public DynamicArray() 
    { 
        array = new int[1]; 
        count = 0; 
        size = 1; 
    } 
	
	public void addElement(int data){
		if(size == count){
			growSize();
		}
		array[count]=data;
		count++;
	}
	
	public void growSize(){
		int temp[] = null;
		if(size == count){
			temp = new int[size * 2] ;
		}
		for(int i=0;i<size;i++){
			temp[i]=array[i];
		}
		array=temp;
		size=size*2;
		System.out.println("size is " + size);
	}
	

	public static void main(String[] args) {
		DynamicArray dy = new DynamicArray();
		
		
		int n=5;
		for (int k=1;k<=n;k++){
			dy.addElement(k);
		}
		
		System.out.println("Elements of array ");
		for(int j=0;j<dy.size;j++){
		System.out.println(dy.array[j]);
		}
		System.out.println("Size of Array "+dy.size);
		System.out.println("Number of elements in array "+dy.count);

	}

}
