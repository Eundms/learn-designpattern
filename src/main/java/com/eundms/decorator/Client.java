package com.eundms.decorator;

public class Client {
	private CommentService commentService;
	public Client(CommentService commentService) {
		this.commentService = commentService;
	}
	public void writeComment(String comment) {
		commentService.addComment(comment);
	}

}