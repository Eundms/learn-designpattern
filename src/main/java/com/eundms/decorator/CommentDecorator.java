package com.eundms.decorator;

public class Decorator implements CommentService {
	private CommentService commentService;
	@Override
	public void addComment(String comment) {
		commentService.addComment(comment);
	}
}
