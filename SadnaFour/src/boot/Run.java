package boot;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;

import data.Factory;
import data.Worker;

public class Run {

	public static void main(String[] args) {
	/*	HashSet<Worker> hs = new HashSet<Worker>();
		hs.add(new Worker(31, 1000, "Mor", 1234));
		hs.add(new Worker(30, 2000, "Charlie", 1235));
		hs.add(new Worker(21, 3000, "Tom", 1234));
		hs.add(new Worker(31, 1000, "Mor", 1236));

//		for(Worker w : hs)
	//		System.out.println(w);
		
		ArrayList<Worker> myList = new ArrayList<Worker>();
		myList.add(new Worker(31, 1000, "Mor", 1234));
		myList.add(new Worker(30, 2000, "Charlie", 1235));
		myList.add(new Worker(21, 3000, "Tom", 1234));
		myList.add(new Worker(31, 1000, "Mor", 1236));

	//	for(Worker w : myList)
	//		System.out.println(w);
		
		
		try {
			ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("outWorker.txt"));
			
			for(Worker w: hs)
				out.writeObject(w);
			
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("outWorker.txt"));
			Worker m = (Worker)in.readObject();
			
			System.out.println(m);
			Worker m2 = (Worker)in.readObject();
			System.out.println(m2);
			
			in.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		*/
		ArrayList<Worker> myList = new ArrayList<Worker>();
		myList.add(new Worker(31, 1000, "Mor", 1234));
		myList.add(new Worker(30, 2000, "Charlie", 1235));
		myList.add(new Worker(21, 3000, "Tom", 1234));
		myList.add(new Worker(31, 1000, "Mor", 1236));
		
		try {
			Factory myFactory = new Factory(myList, "out.txt");
			//myFactory.printData();
			//myFactory.readData();
			
			Thread t = new Thread(myFactory);
			t.start();
			
			new Thread(new Runnable(){
				public void run(){
					myFactory.printData();
				}
			}).start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
