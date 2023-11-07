package com.assessment.org;

import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
        IFeedbackService feedbackService = new FeedbackService();

        try {
            Feedback feedback1 = feedbackService.add("I like cricket ", "Sachin");
            Feedback feedback2 = feedbackService.add("The bikes produce too much heat", "John");

            System.out.println("Feedbacks added successfully:");
            System.out.println("Author: " + feedback1.getAuthor());
            System.out.println("Feedback: " + feedback1.getDescription());

            System.out.println("\nFind feedback by ID:");
            long idToFind = feedback1.getId();
            Feedback foundFeedback = feedbackService.findById(idToFind);
            System.out.println("Author: " + foundFeedback.getAuthor());
            System.out.println("Feedback: " + foundFeedback.getDescription());

            System.out.println("\nFind feedbacks by author name:");
            List<Feedback> feedbacksByAuthor = feedbackService.findFeedbacksByAuthorOrderById();
            for (Feedback feedback : feedbacksByAuthor) {
                System.out.println("Author: " + feedback.getAuthor());
                System.out.println("Feedback: " + feedback.getDescription());
            }
        } catch (InvalidDescription | InvalidAuthorName | InvalidIdException | FeedbackNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


}
