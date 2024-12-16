import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoArrayAndMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = scanner.nextInt();
            }
        }

        if (arr[row - 1][col - 1] == k) {
            System.out.println(0);
            return;
        }

        for (int z = 1; z <= 100; z++) {
            int maxL = Integer.MIN_VALUE;

            if (arr.length < arr[0].length) { // c 연산 문제 인데, 가로로 박혀있다 -> 세로로 바꿔야함
                List<int[]> arrC = new ArrayList<>();

                for (int j = 0; j < arr[0].length; j++) {
                    int[] cArr = new int[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        int cCol = arr[i][j];
                        cArr[i] = cCol;
                    }
                    arrC.add(doSort(cArr));
                }
                int max = arrC.stream().mapToInt(cArr -> cArr.length).max().getAsInt();
                arr = new int[max][arr[0].length];

                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arrC.get(i).length; j++) {
                        arr[j][i] = arrC.get(i)[j];
                    }
                }
                System.out.println("C dustks");
                for (int[] ints : arr) {
                    System.out.println(Arrays.toString(ints));
                }
            } else { // r 연산
                for (int i = 0; i < arr.length; i++) {
                    int[] intArr = doSort(arr[i]);
                    maxL = Math.max(intArr.length, maxL);
                    arr[i] = intArr;

                    // 빈칸들을 정사각형(0으로 만들어) 주는 작업
                }

                for (int i = 0; i < arr.length; i++) {
                    int[] cArr = new int[maxL];
//                    Arrays.fill(cArr, -1);
                    for (int j = 0; j < arr[i].length; j++) {
                        cArr[j] = arr[i][j];
                    }
                    arr[i] = cArr;
                }
                System.out.println("R dustks");
                for (int[] ints : arr) {
                    System.out.println(Arrays.toString(ints));
                }
            }


            if (arr.length >= row && arr[0].length >= col && arr[row-1][col-1] == k) {
                System.out.println(z);
                return;
            }
        }

        System.out.println(-1);


        /*todo
            정렬하라
            숫자 [3 1 1] -> [3 1 1 2]
            횟수 [1 2]
            그니까 횟수가 작은수 부터 기준으로 정렬 | 숫자 먼저(작은수 부터), 그다음에 횟수
         */


    }

    public static int[] doSort(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Entity[] entities = new Entity[map.size()];
        int i = 0;

        for (var entry : map.entrySet()) {
            var key = entry.getKey();
            var val = entry.getValue();
            entities[i] = new Entity(key, val);
            i++;
        }

        Arrays.sort(entities);
        int[] ret = new int[entities.length * 2];
        int index = 0;

        for (int c = 0; c < entities.length; c++) {
            int num = entities[c].num;
            int count = entities[c].count;

            if (num == 0) {
                continue;
            }

            ret[index] = num;
            ret[index + 1] = count;
            index += 2;
        }

        return ret;
    }
}

class Entity implements Comparable<Entity> {
    int num;
    int count;

    public Entity(int num, int count) {
        this.num = num;
        this.count = count;
    }

    // +: 내가 상대방보다 우선순위가 높다
    // 0: 나와 상대방의 우선순위가 같다
    // -: 내가 상대방보다 우선순위가 낮다
    // 모든것은 우선순위가 낮은것부터 높은순으로 정렬된다

    // 카운트에대한 오름차순?

    @Override
    public int compareTo(Entity o) {
        if (this.count == o.count) {
            return this.num - o.num;
        }
        return this.count - o.count;

//         if(this.count < o.count){
//             return -1;
//         } else if (this.count > o.count) {
//             return +1;
//         }else{
//             if (this.num < o.num) {
//                 return -1;
//             } else if (this.num > o.num) {
//                 return +1;
//             } else {
//                 return 0;
//             }
//         }
    }
}
