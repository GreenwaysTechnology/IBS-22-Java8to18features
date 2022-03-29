package com.ibs.javafeatures.versions;

public class GetVersionInfo {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();                 // Getting runtime version instance
        System.out.println("Current version is " + version);           // Getting current Java version
        System.out.println("Major version number " + version.feature()); // Getting major version number
        System.out.println("Minor version number " + version.interim()); // Getting minor version number
        System.out.println("Security version number " + version.update());  // Getting security version number
        System.out.println("Pre-released information " + version.pre());      // Getting pre-release version information
        System.out.println("Build Number " + version.build());                // Getting Optional build number
    }
}
