package week3.day1.assignment1;

public interface Language {

	public void Java();
	
	public default void lang() {
		System.out.println("Language is used to write coding");
	}
}
