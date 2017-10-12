package de.bund.bva.isyfact.task;

import java.util.List;

import de.bund.bva.isyfact.task.model.TaskRunner;

/**
 * Der TaskScheduler bietet die Möglichkeit, dass Aufgaben (Tasks) zu bestimmten Zeitpunkten ausgeführt werden können.
 *
 * @author Alexander Salvanos, msg systems ag
 *
 */
public interface TaskScheduler {

	void starteKonfigurierteTasks();

	/**
	 *
	 */
	void addTask(TaskRunner taskRunner);

	/**
	 *
	 */
	void start() throws NoSuchMethodException;


	/**
	 *
	 * @param seconds
	 * @throws InterruptedException
	 */
	void awaitTerminationInSeconds(long seconds) throws InterruptedException;

	/**
	 *
	 */
    void shutDown();

	/**
	 *
	 */
	List<Runnable> shutDownNow();

	/**
	 *
	 */
	boolean isTerminated();
}
