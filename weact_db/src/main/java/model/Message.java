package model;

public class Message {

	
	private int sender,receiver;
	private String messageText, subjectText;
	
	public Message(int senderID, int receiverID, String message, String subject ){
		sender = senderID;
		receiver = receiverID;
		messageText= message;
		subjectText = subject;
		
	}
}
