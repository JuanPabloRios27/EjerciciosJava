package edu.unbosque.tasks.main;

import edu.unbosque.tasks.controller.Controller;
import edu.unbosque.tasks.model.priority;
import edu.unbosque.tasks.model.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.lang.Comparable;


public class AplMain {

	public static void main(String[] args) {
		Stack<task> stack = new Stack<task>();
		Queue<task> queue = new LinkedList<task>();
		ArrayList<task> array;
		stack.push(new task(1001, "Clear Database", priority.LOW));
		stack.push(new task(1002, "Backup database", priority.HIGH));
		stack.push(new task(1003, "Backup restore", priority.MEDIUM));
		queue.offer(new task(1001, "Clear Database", priority.LOW));
        queue.offer(new task(1002, "Backup database", priority.HIGH));
        queue.offer(new task(1003, "Backup restore", priority.MEDIUM));
        
        PriorityQueue<task> pQueue = new PriorityQueue<task>(3);
        
        // Adding items to the pQueue using add()
        pQueue.add(new task(1001,"Clear database",priority.HIGH));
        pQueue.add(new task(1002,"Backup Database",priority.HIGH));
        pQueue.add(new task(1003,"Backup Restore",priority.HIGH));

        task m;
        m = pQueue.poll();
		new Controller();

	}

}
