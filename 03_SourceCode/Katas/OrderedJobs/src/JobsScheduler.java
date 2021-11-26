import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JobsScheduler {
    private List<Job> jobs = new LinkedList<>();

    public void registerJob(String jobName) {
        Job job = new Job(jobName);
        if (!jobs.contains(job)) jobs.add(job);
    }

    public void sort() {
        char[] arr = jobs.toCharArray();
        Arrays.sort(arr);
        jobs = new String(arr);
    }

    public String getList() {
        return jobs;
    }

    public void registerJob(String dependentJob, String independentJob) {
        Job job = new Job(independentJob);
        if (!jobs.contains(job)) jobs.add(job);
        Job job2 = new Job(dependentJob, job);
        if (!jobs.contains(job2)) jobs.add(job2);
    }
}
