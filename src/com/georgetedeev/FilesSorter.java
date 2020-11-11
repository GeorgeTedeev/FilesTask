package com.georgetedeev;

import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilesSorter {

    public static List<Path> sortListOfFilePaths(List<Path> pathsOfFiles){
        Collections.sort(pathsOfFiles, Comparator.comparing(Path::getFileName));

        return pathsOfFiles;
    }

}
