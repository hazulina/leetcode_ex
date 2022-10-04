package org.example;

import java.util.*;

public class Task_695_MaxAreaOfIsland {
    List<Integer> areas = new ArrayList<>();
    boolean[][] flags;

    public int maxAreaOfIsland(int[][] grid) {
        flags = new boolean[grid.length][grid[0].length];
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && !flags[i][j]) {
                    areas.add(checkArea(grid, i, j));
                }
            }
        }
        if (!areas.isEmpty()) {
            Collections.sort(areas);
            maxArea = areas.get(areas.size() - 1);
        }
        return maxArea;
    }
    public int checkArea(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || flags[i][j] || grid[i][j] == 0) {
            return 0;
        }
        flags[i][j] = true;
        return (1 +
                checkArea(grid, i + 1, j) +
                checkArea(grid, i - 1, j) +
                checkArea(grid, i, j + 1) +
                checkArea(grid, i, j - 1));
    }   
}
