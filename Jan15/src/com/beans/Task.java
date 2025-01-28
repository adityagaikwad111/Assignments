/* 
 * Represents a Task with an ID, Task, Time to complete the task and Date to complete the task * 
 */

package com.beans;
import java.time.*;

public class Task {
	private int task_id;
	private String task;
	private LocalTime time_of_completion;
	private LocalDate date_of_completion;
	
	public Task() {
		super();
	}
	
	/*
	 * Constructs a Task with specified ID, Task, Time to complete the task and Date to complete the task 
	 * @param task_id: Unique identifier of the product
	 * @param task: Task details
	 * @param time_of_completion: Time to complete the task
	 * @param date_of_completion: Date to complete the task 
	 */
	public Task(int task_id, String task, LocalTime time_of_completion, LocalDate date_of_completion) {
		super();
		this.task_id = task_id;
		this.task = task;
		this.time_of_completion = time_of_completion;
		this.date_of_completion = date_of_completion;
	}
	
	/*
	 * returns the Task ID
	 * @return task_id
	 */
	public int getTask_id() {
		return task_id;
	}
	
	/*
	 * sets the Task ID
	 * @param task_id the new Task ID
	 */
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	
	/*
	 * returns the Task details
	 * @return task
	 */
	public String getTask() {
		return task;
	}
	
	/*
	 * sets the Task details
	 * @param task for the new Task details
	 */
	public void setTask(String task) {
		this.task = task;
	}
	
	/*
	 * returns the Time to complete the Task
	 * @return time_of_completion
	 */
	public LocalTime getTime_of_completion() {
		return time_of_completion;
	}
	
	/*
	 * sets the Time to complete the task
	 * @param time_of_completion for Time to Complete the Task
	 */
	public void setTime_of_completion(LocalTime time_of_completion) {
		this.time_of_completion = time_of_completion;
	}
	
	/*
	 * returns the Date to complete the Task
	 * @return date_of_completion
	 */
	public LocalDate getDate_of_completion() {
		return date_of_completion;
	}
	
	/*
	 * sets the Date to complete the task
	 * @param date_of_completion for Date to Complete the Task
	 */
	public void setDate_of_completion(LocalDate date_of_completion) {
		this.date_of_completion = date_of_completion;
	}
	
	/*
	 * returns a string representation of the Task
	 * @return a string containing Task ID, Task, Time to complete the task and Date to complete the task
	 */
	@Override
	public String toString() {
		return "Task [task_id=" + task_id + ", task=" + task + ", time_of_completion=" + time_of_completion
				+ ", date_of_completion=" + date_of_completion + "]";
	}	
}
