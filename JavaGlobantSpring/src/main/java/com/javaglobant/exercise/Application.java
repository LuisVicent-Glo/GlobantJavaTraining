package com.javaglobant.exercises;

import com.javaglobant.exercises.service.SpeakerService;
import com.javaglobant.exercises.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {

        SpeakerService speakerService = new SpeakerServiceImpl();

        System.out.println(speakerService.findAll().get(0).getName());
    }
}
