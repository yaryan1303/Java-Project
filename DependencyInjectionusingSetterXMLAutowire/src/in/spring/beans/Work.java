package in.spring.beans;

public class Work {
	private String play;
	private String subject;
	public String getPlay() {
		return play;
	}
	public void setPlay(String play) {
		this.play = play;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Work [play=" + play + ", subject=" + subject + "]";
	}
	
	

}
