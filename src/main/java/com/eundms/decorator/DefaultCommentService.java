package com.eundms.decorator;

import java.util.ArrayList;
import java.util.List;

public class CommentServiceddd implements CommentService, Decoratable {
	private List<String> comments = new ArrayList<>();

	@Override
	public void addComment(String comment) {
		comments.add(comment);
	}
}
