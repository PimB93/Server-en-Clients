package model;

public class Message {

	
	private int sender, receiver, berichtID;
	private String messageText, subjectText;
	
	/**
	 * 
	 * @param berichtID
	 * @param senderID
	 * @param receiverID
	 * @param message
	 * @param subject
	 */
	public Message(int berichtID, int senderID, int receiverID, String message, String subject){
		sender = senderID;
		receiver = receiverID;
		messageText = message;
		subjectText = subject;
	}
	
	public int getBerichtID(){
		return berichtID;
	}
	
	public void setBerichtID(int berichtID){
		this.berichtID = berichtID;
	}

	public int getSender() {
		return sender;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public int getReceiver() {
		return receiver;
	}

	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getSubjectText() {
		return subjectText;
	}

	public void setSubjectText(String subjectText) {
		this.subjectText = subjectText;
	}
}
