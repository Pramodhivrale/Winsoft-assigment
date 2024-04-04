package com.data;

import java.util.Arrays;

public class ArraySorting {
	void meth1() {
		// int x[]= {0,2,0,3,0,5,6,0,0}; 0 is vaccent cells
		int x[] = { 2, 3, 5, 6 };
		int y[] = { 1, 8, 9, 10, 15 };

		int xy[] = new int[x.length + y.length];

		for (int i = 0; i <= x.length - 1; i++) {
			xy[i] = x[i];
		}
		for (int i = 0; i <= y.length - 1; i++) {
			xy[x.length + i] = y[i];
		}

		Arrays.sort(xy);

		for (int i = 0; i <= xy.length - 1; i++) {

			System.out.print(xy[i] + " ");

		}

//        for(int i=0;i<=xy.length-1;i++)
//        {
//        	if(xy[i] != 0)
//        	{
//        		System.out.print(xy[i]+" ");
//        	}
//        	
//        }
	}

	public static void main(String[] args) {
		new ArraySorting().meth1();

	}

}
