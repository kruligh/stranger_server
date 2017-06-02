package com.yeahbunny.stranger.server.services;

import java.util.List;

import com.yeahbunny.stranger.server.model.Event;

public interface EventService {
	/**
	 * 
	 * @return All services with all children entities
	 */
	public List<Event> findAllEventsEagerly();
	
	/**
	 * 
	 * @return All services without children entities
	 */
	public List<Event> findAllEventsLazy();
	
	/**
	 * 
	 * @param eventId
	 * @return
	 */
	public Event findEventById(long eventId);

	/**
	 * 
	 * @param id
	 * @return Event with eagerly loaded children entities
	 */
	Event findEventByIdEagerly(long id);

	/**
	 * 
	 * @param username
	 * @return
	 */
	List<Event> findEventsCreatedByUser(String username);
	
	public Long save(Event event);

	List<Event> findEventsAttendedByUser(String username);
}
