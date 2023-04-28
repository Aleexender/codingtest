import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhoDidNotSubmit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int studentNumWhoCall = 28;
        final int totalStudent = 30;
        boolean arr[] = new boolean[31];

