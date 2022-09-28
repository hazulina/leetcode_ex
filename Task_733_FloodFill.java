import java.util.Arrays;

public class Task_733_FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc]) {
            return image;
        }
        int startColour = image[sr][sc];
        image[sr][sc] = color;
        goingDeep(image, sr, sc, color, startColour);
        return image;
    }

    public void goingDeep(int[][] image, int sr, int sc, int color, int startColour) {
        if (sc < image[sr].length - 1 && image[sr][sc] == color && image[sr][sc + 1] == startColour) {
            image[sr][sc + 1] = color;
            goingDeep(image, sr, sc + 1, color, startColour);
        }
        if (sr < image.length - 1 && image[sr][sc] == color && image[sr + 1][sc] == startColour) {
            image[sr + 1][sc] = color;
            goingDeep(image, sr + 1, sc, color, startColour);
        }
        if (sc > 0 && image[sr][sc] == color && image[sr][sc - 1] == startColour) {
            image[sr][sc - 1] = color;
            goingDeep(image, sr, sc - 1, color, startColour);
        }
        if (sr > 0 && image[sr][sc] == color && image[sr - 1][sc] == startColour) {
            image[sr - 1][sc] = color;
            goingDeep(image, sr - 1, sc, color, startColour);
        }

    }
}
