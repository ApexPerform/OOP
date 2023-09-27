
public class Opdracht {

	private String Name;
	
	private int Score;
	

	public Opdracht(String name, int score) {
		super();
		Name = name;
		Score = score;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}
}
