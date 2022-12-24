import java.util.Arrays;
import java.util.Scanner;

public class AgeRank {
    static class AgeName implements Comparable<AgeName> {
        String name;
        int age;

        AgeName(int age, String name) {
            this.age = age;
            this.name = name;
        }
