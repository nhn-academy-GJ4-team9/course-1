package org.example;

/**
 * 0,0 에서 시작해서 오른쪽 맨 아래 7,7 까지 길을 찾는 알고리즘 만들기
 * <p>
 * 동 서 남 북 으로만 이동가능
 * <p>
 * 재귀이용
 * <p>
 * 0은 이동가능한 길 1은 이동불가능한 벽
 * 2는 막힌 길     3은 이동중인 길
 * <p>
 * <p>
 * <p>
 * 북 동 남 서 (시계방향)순으로 탐색했을 때 결과
 * <p>
 * 0 0 0 0 0 0 0 1
 * 0 1 1 0 1 1 0 1
 * 0 0 0 1 0 0 0 1
 * 0 1 0 0 1 1 0 0
 * 0 1 1 1 0 0 1 1
 * 0 1 0 0 0 1 0 1
 * 0 0 0 1 0 0 0 1
 * 0 1 1 1 0 1 0 0
 * <p>
 * 3 2 2 2 2 2 2 1
 * 3 1 1 2 1 1 2 1
 * 3 2 2 1 2 2 2 1
 * 3 1 2 2 1 1 2 2
 * 3 1 1 1 2 2 1 1
 * 3 1 3 3 3 1 2 1
 * 3 3 3 1 3 3 3 1
 * 0 1 1 1 0 1 3 3
 */
public class Maze {
    private static int n = 8;
    private static int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0},
    };

    private static final int PATHWAY = 0;
    private static final int WALL = 1;
    private static final int BLOCKED = 2;
    private static final int PATH = 3;


    public static boolean findPath(int x, int y) {
        if (x == (n - 1) && y == (n - 1)) {
            maze[x][y] = PATH;
            return true;
        } else if (x >= n || y >= n || x < 0 || y < 0) {
            return false;
        } else if (maze[x][y] != PATHWAY) {
            return false;
        } else {
            maze[x][y] = PATH;
            if (findPath(x - 1, y) || findPath(x, y + 1) || findPath(x + 1, y) || findPath(x, y - 1)) {
                return true;
            } else {
                maze[x][y] = BLOCKED;
                return false;
            }
        }

    }

    public static void main(String[] args) {
        printMaze();
        findPath(0, 0);
        printMaze();
    }

    private static void printMaze() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}