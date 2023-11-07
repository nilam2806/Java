package com.assessment.org;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public interface IFeedbackService {

	Feedback add(String description, String authorName);

	Feedback findById(long id);

	List<Feedback> findFeedbacksByAuthorOrderById(String author);

}
