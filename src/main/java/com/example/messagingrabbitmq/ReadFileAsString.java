package com.example.messagingrabbitmq;

import java.io.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadFileAsString {
    public String prepareMessage() throws IOException {

        Path path = Paths.get("File/testFile");

        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(path);
        } catch (IOException ex) {
            ex.getMessage();
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
