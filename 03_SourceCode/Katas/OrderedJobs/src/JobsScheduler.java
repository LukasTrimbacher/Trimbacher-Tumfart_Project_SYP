import javax.naming.Binding;
import java.util.*;

public class JobsScheduler {
    private List<Job> independentJobs = new LinkedList<>();


    public void registerJob(String jobName) {
        Job job = new Job(jobName);
        if(containsJob(job, independentJobs) == null) independentJobs.add(job);
    }

    public Job containsJob(Job job, List<Job> jobs){
        for(Job j : jobs){
            Job job2 = containsJob(job, j.getDependets());
            if(job2 != null) return job2;
            if (j.getName().equals(job.getName())) return j;
        }
        return null;
    }

    public void sort() {

    }

    public String getList() {
        String s = "";
        for(Job j : independentJobs){
            s += j.toString();
        }
        return s;
    }

    public void registerJob(String dependentJob, String independentJob) {
        Job job = new Job(independentJob);
        Job job2 = new Job(dependentJob);
        Job job3 = containsJob(job, independentJobs);
        if (job3 == null){
            independentJobs.add(job);
            job.add(job2);
        }
        else{
            job3.add(job2);
        }
    }
}
