package ru.job4j;

        import ru.job4j.array.FindLoop;
        import ru.job4j.array.MinDiapason;
        import ru.job4j.array.SwitchArray;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
            //swap(...)
        }
        return data;
    }
}
