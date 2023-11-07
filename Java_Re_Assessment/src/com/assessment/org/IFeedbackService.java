package com.assessment.org;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IFeedbackService {
	
	    Feedback add(String description, String authorName) throws InvalidDescription, InvalidAuthorName;

	    Feedback findById(long feedbackId) throws InvalidIdException, FeedbackNotFoundException;

	    List<Feedback> findFeedbacksByAuthorOrderById();
	}

	class FeedbackService implements IFeedbackService {
	    private Map<Long, Feedback> feedbackStore;
	    private long nextId;

	    public FeedbackService() {
	        feedbackStore = new HashMap<>();
	        nextId = 1;
	    }

	    @Override
	    public Feedback add(String description, String authorName) throws InvalidDescription, InvalidAuthorName {
	        if (description == null || description.length() < 5 || description.length() > 50) {
	            throw new InvalidDescription("Description should be between 5 and 50 characters.");
	        }

	        if (authorName == null || authorName.length() < 2 || authorName.length() > 20 || !authorName.matches("^[a-zA-Z]+$")) {
	            throw new InvalidAuthorName("Author name should be between 2 and 20 characters and contain only letters.");
	        }

	        long feedbackId = nextId++;
	        Feedback feedback = new Feedback(feedbackId, description, authorName);
	        feedbackStore.put(feedbackId, feedback);
	        return feedback;
	    }

	    @Override
	    public Feedback findById(long feedbackId) throws InvalidIdException, FeedbackNotFoundException {
	        if (feedbackId <= 0) {
	            throw new InvalidIdException("Invalid ID. ID should be greater than zero.");
	        }

	        Feedback feedback = feedbackStore.get(feedbackId);
	        if (feedback == null) {
	            throw new FeedbackNotFoundException("Feedback not found.");
	        }

	        return feedback;
	    }

	    @Override
	    public List<Feedback> findFeedbacksByAuthorOrderById() {
	        List<Feedback> feedbacks = new ArrayList<>(feedbackStore.values());
	        feedbacks.sort(Comparator.comparing(Feedback::getId));
	        return feedbacks;
	    }


}
