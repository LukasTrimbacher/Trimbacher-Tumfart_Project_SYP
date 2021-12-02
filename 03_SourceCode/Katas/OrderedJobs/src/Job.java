import java.util.LinkedList;
import java.util.List;

public class Job {
    private String name;
    private List<Job> dependets;

    public Job(String name) {
        this.name = name;
        dependets = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public List<Job> getDependets() {
        return dependets;
    }
    public void add(Job job){
        dependets.add(job);
    }

    @Override
    public String toString() {
        String s = getName();
        for(Job j : dependets){
            s += j.toString();
        }
        return s;
    }
}

