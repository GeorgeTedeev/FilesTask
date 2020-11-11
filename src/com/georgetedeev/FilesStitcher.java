package com.georgetedeev;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesStitcher {

    public static void stitchFiles(List<Path> pathsOfFiles, Path endFilePath){
        File endFile = new File(endFilePath.toString());

        createEndFileIfItDoesntExist(endFile);

        for (Path currentFilePath: pathsOfFiles) {

            try {
                Files.write(endFilePath, Files.readAllLines(currentFilePath),StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static void createEndFileIfItDoesntExist(File endFile){

        try {
            endFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
