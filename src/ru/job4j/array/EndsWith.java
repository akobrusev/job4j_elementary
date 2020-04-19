package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int x = word.length - post.length;
        for (int index = post.length - 1; index >= 0; index--) {
            if (word[index + x] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
