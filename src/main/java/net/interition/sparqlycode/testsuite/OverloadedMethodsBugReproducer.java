/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
 
 package net.interition.sparqlycode.testsuite;

/**
 * 
 * @author Paul Worrall, Interition Ltd.
 *
 */

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
