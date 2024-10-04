package in.spring.beans;

public class Work {
	private String play;
	private String subject;
	
	
	public Work(String play, String subject) {
		this.play = play;
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Work [play=" + play + ", subject=" + subject + "]";
	}
	
	

}
