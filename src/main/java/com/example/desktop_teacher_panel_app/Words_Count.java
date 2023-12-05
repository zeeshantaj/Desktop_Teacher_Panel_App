package com.example.desktop_teacher_panel_app;

public class Words_Count {
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        String[] count = sentence.split(" ");
        System.out.println("total words "+count.length);
    }
}
