import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minecraft {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] reader = bufferedReader.readLine().split(" ");
        int row = Integer.parseInt(reader[0]);
        int col = Integer.parseInt(reader[1]);
        int invent = Integer.parseInt(reader[2]);
        int maxHeight = 0;
        int min = Integer.MAX_VALUE;
        int[] blocks = new int[257];
        for (int i = 0; i < row; i++) {
            reader = bufferedReader.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                blocks[Integer.parseInt(reader[j])]++;
            }
        }

        for (int targetHeight = 0; targetHeight < blocks.length; targetHeight++) {
            int time = 0;
            int neededBlock = 0;
            for (int height = 0; height < blocks.length; height++) {
                if (blocks[height] == 0) {
                    continue;
                }
                if (targetHeight < height) { // 내 지금 높이가 높을때
                    time += blocks[height] * 2 * (height - targetHeight);
                    neededBlock -= blocks[height] * (height - targetHeight);
                } else { // 내 지금 높이가 낮을때
                    time += blocks[height] * (targetHeight - height);
                    int minusBlocks = blocks[height] * (targetHeight - height);
                    neededBlock += minusBlocks;
                }
            }
            int finalNeedBlock = invent - neededBlock;
            if (finalNeedBlock < 0) {
                continue;
            }
            if (min == time) {
                maxHeight = java.lang.Math.max(maxHeight, targetHeight);
            }
            if (time < min) {
                min = time;
                maxHeight = targetHeight;
            }
        }

        System.out.println(min + " " + maxHeight);


    }
}
