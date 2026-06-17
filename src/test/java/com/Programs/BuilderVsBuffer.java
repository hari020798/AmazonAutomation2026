package com.Programs;

public class BuilderVsBuffer {
	
	
	private void Builderrtime() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < 10000000; i++) {
            builder.append("A");
        }

        long end = System.currentTimeMillis();

        System.out.println("Builder Time: " + (end - start));
    }
	
	private void Bufferrtime() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer();

        for(int i = 0; i < 10000000; i++) {
        	buffer.append("A");
        }

        long end = System.currentTimeMillis();

        System.out.println("buffer Time: " + (end - start));
    }
	
	public static void main(String[] args) {
		BuilderVsBuffer bf = new BuilderVsBuffer();
//        bf.Builderrtime();

        bf.Bufferrtime();
	}
	}


