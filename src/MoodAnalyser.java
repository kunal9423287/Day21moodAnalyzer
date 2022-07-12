
public class MoodAnalyser {

	private String msg;
    public MoodAnalyser() {
    }

    public MoodAnalyser(String msg){
        this.msg = msg;
    }

    public String analyzeMood(String msg) {
        if(msg.contains("Sad")){
            return "Sad";
        }
        return "Happy";
    }
}