package com.georgetedeev;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please, enter root folder`s path:");
        Path rootPath = PathExistingChecker.getRootPathFromConsoleIfItExists(console);

        System.out.println("Please, enter end file`s path and file`s name" +
                "(If you enter just a file`s name, the directory of end file will be in project`s root):");
        Path endFilePath = Path.of(console.nextLine());


        FilesStitcher
                .stitchFiles(FilesSorter
                        .sortListOfFilePaths(FilesFinder
                                .getListOfAllFilePaths(rootPath)), endFilePath);
    }

}
