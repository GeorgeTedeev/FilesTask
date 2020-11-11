package com.georgetedeev;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class PathExistingChecker {

    public static Path getRootPathFromConsoleIfItExists(Scanner console){
        boolean isRootPathExists = false;
        Path rootPath = null;

        while(!isRootPathExists){
            rootPath = Path.of(console.nextLine());
            if(Files.exists(rootPath)){
                isRootPathExists = true;
            }
            else{
                System.out.println("There is no such directory. Please, try once more:");
            }
        }

        return rootPath;
    }
}
