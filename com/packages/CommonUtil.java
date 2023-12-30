package com.packages; // Package declaration

/*
 * A package is a way to organize and structure classes and interfaces into a hierarchical directory structure. Packages help prevent naming conflicts, provide better organization, and support access control.
 * A java package is a group of similar types of classes, interfaces and sub-packages.
 * The package declaration and the directory structure should match.
 */

public class CommonUtil {
    public static <T> void log(T msg) {
        System.out.println(msg);
    }
}