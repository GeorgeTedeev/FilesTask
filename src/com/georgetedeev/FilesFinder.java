package com.georgetedeev;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesFinder {

    public static List<Path> getListOfAllFilePaths(Path rootPath){
        List<Path> pathsOfFiles = new ArrayList<>();

        try (Stream<Path> paths = Files.walk(rootPath)) {
            pathsOfFiles.addAll(paths
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pathsOfFiles;
    }
}
