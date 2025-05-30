package com.eundms.decorator;

public class App {
	private static boolean enabledSpamFilter = true, enabledTrimming = true;

	public static void main(String[] args) {
		CommentService commentService = new DefaultCommentService();

		if(enabledSpamFilter) { // 한번 감싼다
			commentService = new SpamFilteringCommentDecorator(commentService);
		}

		if(enabledTrimming) {
			commentService = new TrimmingCommentDecorator(commentService);
		}

		// 클라이언트 측면에서는 동일함
		Client client = new Client(commentService);
		client.writeComment("오징어게임");
		client.writeComment("http://whiteship.me");

	}
}
