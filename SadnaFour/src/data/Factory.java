package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Factory implements Runnable{
	
	private ArrayList<Worker> workers;
	private PrintWriter writer;
	private BufferedReader reader;
	
	public Factory(ArrayList<Worker> workers, String outFile) throws IOException {
		this.workers = workers;
		writer = new PrintWriter(new FileWriter(outFile));
		reader = new BufferedReader(new FileReader(outFile));
	}
	
	public void printData(){
		System.out.println("print data");
		for(Worker w : workers)
			writer.println(w);
		
		writer.close();
	}
	
	public void readData() throws IOException{
		System.out.println("read data");
		String line;
		while( ( line = reader.readLine())!= null){
			//System.out.println(line);
			workers.add(new Worker(line));
		}
		reader.close();
		
		for(Worker w : workers)
			System.out.println(w);
	}

	@Override
	synchronized public void run() {
		System.out.println("print data thread");
		for(Worker w : workers)
			writer.println(w);
		
		writer.close();
		
	}
}
