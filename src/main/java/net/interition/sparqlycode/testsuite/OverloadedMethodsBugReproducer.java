package net.interition.sparqlycode.testsuite;

// reproducing http://www.interition.net:3030/browse/COD-230

public class OverloadedMethodsBugReproducer {
	
	private String jobId;
	private Number payload;
	private long delay;
	private String cronEntry;
	private long start;
	private long period;
	private int repeat;
	
    public void schedule(String jobId, Number payload, long delay) throws Exception {
        this.jobId = jobId;
        this.payload = payload;
        this.delay=delay;
    }

    public void schedule(String jobId, Number payload, String cronEntry, long start, long period, int repeat) throws Exception {
        this.jobId = jobId;
        this.payload = payload;
        this.cronEntry = cronEntry;
        this.start = start;
        this.period = period;
        this.repeat = repeat;
    }

    public void schedule(String jobId, Number payload, String cronEntry) throws Exception {
        this.jobId = jobId;
        this.payload = payload;
        this.cronEntry = cronEntry;
    }

}
