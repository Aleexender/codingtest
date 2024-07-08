import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SharkSchool {
    static int[] DIR_ROW = {-1, 0, 1, 0};
    static int[] DIR_COL = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] students = new int[n * n+1][4];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < students.length; i++) {
            int row = scanner.nextInt();
            q.add(row);
            for (int k = 0; k < 4; k++) {
                students[row][k] = scanner.nextInt();
            }
        }

        int[][] room = new int[n][n];

        while (!q.isEmpty()) {
            Integer stu = q.poll();
            int[] a = students[stu];
            int max = Integer.MIN_VALUE;
            Queue<Integer> maxLocationQ = new LinkedList<>();

            for (int row = 0; row < room.length; row++) {
                for (int col = 0; col < room.length; col++) {
                    if(room[row][col] != 0){
                        continue;
                    }
                    int likedStudentCount = 0;

                    for (int z = 0; z < 4; z++) {
                        int newRow = row + DIR_ROW[z];
                        int newCol = col + DIR_COL[z];

                        if (isLengthFine(room, newRow, newCol) && isLikedStudent(room, newRow, newCol, a)) {
                            likedStudentCount ++;
                        }

                    }
                    if (likedStudentCount > max) {
                        max = likedStudentCount;
                        maxLocationQ.clear();
                        maxLocationQ.add(row);
                        maxLocationQ.add(col);
                    } else if (likedStudentCount == max) {
                        maxLocationQ.add(row); // row
                        maxLocationQ.add(col); // col
                    }
                }
            }

            if (maxLocationQ.size() == 2) {
                Integer row = maxLocationQ.poll();
                Integer col = maxLocationQ.poll();
                room[row][col] = stu;
                continue;
            }

            int seatMax = Integer.MIN_VALUE;
            Queue<Integer> emptySeatQ = new LinkedList<>();

            //2번으로 넘어가기
            while (!maxLocationQ.isEmpty()) {
                Integer row = maxLocationQ.poll();
                Integer col = maxLocationQ.poll();
                int emptySeat = 0;

                for (int i = 0; i < 4; i++) {
                    int newRow = row + DIR_ROW[i];
                    int newCol = col + DIR_COL[i];

                    if (isLengthFine(room,newRow,newCol) && room[newRow][newCol] == 0) {
                        emptySeat++;
                    }
                }

                if (emptySeat > seatMax) {
                    emptySeatQ.clear();
                    seatMax = emptySeat;
                    emptySeatQ.add(row);
                    emptySeatQ.add(col);
                } else if (emptySeat == seatMax) {
                    emptySeatQ.add(row);
                    emptySeatQ.add(col);
                }
            }


            if (emptySeatQ.size() == 2) {
                Integer row = emptySeatQ.poll();
                Integer col = emptySeatQ.poll();
                room[row][col] = stu;
                continue;
            }

            int minRow = Integer.MAX_VALUE;
            int minCol = Integer.MAX_VALUE;


            while (!emptySeatQ.isEmpty()){
                Integer row = emptySeatQ.poll();
                Integer col = emptySeatQ.poll();

                if (row < minRow) {
                    minRow = row;
                    minCol = col;
                } else if (row == minRow) {
                    minCol = java.lang.Math.min(minCol, col);
                }
            }

            room[minRow][minCol] = stu;

        }

        int sum =0;

        for(int i =0; i< room.length; i++){
            for(int k =0; k< room.length; k++) {
                int likedStudentsCount = 0;




                for (int z = 0; z < 4; z++) {
                    int newRow = i + DIR_ROW[z];
                    int newCol = k + DIR_COL[z];

                    if (isLengthFine(room, newRow, newCol) && isLikedStudent(room, newRow, newCol, students[room[i][k]])) {
                        likedStudentsCount++;
                    }
                }
                if (likedStudentsCount == 1) {
                    sum += 1;
                } else if (likedStudentsCount == 2) {
                    sum += 10;
                } else if (likedStudentsCount == 3) {
                    sum += 100;
                } else if (likedStudentsCount == 4) {
                    sum += 1000;
                }
            }
        }

        System.out.println(sum);

    }

    private static boolean isLikedStudent(int[][] room, int newRow, int newCol,
                                          int[] a) {
        for (int h = 0; h < 4; h++) {
            if (room[newRow][newCol] == a[h]) {
                return true;
            }
        }
        return false;
    }

    private static boolean isLengthFine(int[][] room, int newRow, int newCol) {
        return newRow >= 0 && newRow < room.length && newCol >= 0 && newCol < room.length;
    }
}
