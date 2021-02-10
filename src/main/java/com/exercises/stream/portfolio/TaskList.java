package com.exercises.stream.portfolio;

import java.util.LinkedList;
import java.util.List;

public final class TaskList {
	private final List<Task> tasks = new LinkedList<>();
	private final String name;
	
	public TaskList(String name) {
		this.name = name;
	}
	
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	public boolean removeTask(Task task) {
		return tasks.remove(task);
	}

	public List<Task> getTasks() {
		return new LinkedList<>(tasks);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TaskList [tasks=" + tasks + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskList other = (TaskList) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
