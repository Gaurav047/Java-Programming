package com.hello.helloworld;

public class multiplicationTable {
	
	void printTable() {
		for ( int i=1 ; i<=10 ; i++ ) {
			System.out.printf("%d * %d = %d\n", 5, i, 5*i);
			
		}
	}
	void printXTable(int table ) {
		for ( int i=1 ; i<=10 ; i++ ) {
			System.out.printf("%d * %d = %d\n", table, i, table*i);
			
		}
	}
	void pTable(int table, int beg, int end) {
		for ( int i=beg ; i<=end ; i++ ) {
			System.out.printf("%d * %d = %d\n", table, i, table*i);
			
		}
	}
	
}
