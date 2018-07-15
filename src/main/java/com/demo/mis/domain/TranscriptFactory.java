package com.demo.mis.domain;

public class TranscriptFactory {

    public static Transcript CreateTranscript(Section section,Student student){
        Transcript transcript = new Transcript();
        transcript.student = student;
        transcript.section = section;
        return transcript;
    }
}
