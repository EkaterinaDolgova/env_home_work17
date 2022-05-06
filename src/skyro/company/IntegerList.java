package skyro.company;

import java.util.Arrays;

public class IntegerList {
    public static void add(int[] ints, int item) {
        Integer[] addArray = new Integer[ints.length + 1];
        for (int i = 0; i < ints.length; i++) {
            addArray[i] = ints[i];
        }
        addArray[ints.length - 1] = item;
        System.out.println("Добавили: " + addArray[ints.length - 1]);
    }

    public static void addIndex(int[] ints, int index, int item) {
        Integer[] addArray = new Integer[ints.length + 1];
        for (int i = 0; i < ints.length; i++) {
            addArray[i] = ints[i];
        }
        addArray[index] = item;
        System.out.println("Добавили: " + addArray[index]);
    }

    public static void set(int[] ints, int index, int item) {
        ints[index] = item;
        System.out.println("Перезаписали: " + ints[index] + " в ячейке: " + index);
    }

    public static void remove(int[] ints, int item) {
        int[] newArr = null;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] == item) {
                newArr = new int[ints.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = ints[index];
                }
                for (int j = i; j < ints.length - 1; j++) {
                    newArr[j] = ints[j + 1];
                }
                break;
            }
        }
        System.out.println("Удалили: " + item);
    }

    public static void removeIndex(int[] ints, int index) {
        int[] newArr = null;
        for (int i = 0; i < ints.length - 1; i++) {
            if (i == index) {
                newArr = new int[ints.length - 1];
                for (int jj = 0; jj < i; jj++) {
                    newArr[jj] = ints[jj];
                }
                for (int j = i; j < ints.length - 1; j++) {
                    newArr[j] = ints[j + 1];
                }
                break;
            }
        }
        System.out.println("Удалили по индексу: " + index);
    }

    public static void contains(int[] ints, int item) {
        boolean c = false;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] == item) {
                c = true;
            }
        }
        System.out.println(c);
    }

    public static void indexOf(int[] ints, int item) {
        int j = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == item) {
                j = i;
            } else j = -1;
            System.out.println(j);
        }
    }

    public static void lastIndexOf(int[] ints, int item) {
        int j = 0;
        for (int i = ints.length - 1; i >= 0; i--) {
            if (ints[i] == item) {
                j = i;
            } else j = -1;
            System.out.println(j);
        }
    }

    public static void get(int[] ints, int index) {
        System.out.println(ints[index]);
    }

    public static void eguals(int[] ints, int[] ints_) {
        if (ints.equals(ints_)) {
            System.out.println(true);
        }
        System.out.println(false);
    }

    public static void size(int[] ints) {
        System.out.println(ints.length);
    }

    public static void isEmpty(int[] ints) {
        if (ints.length == 0) {
            System.out.println(true);
        }
        System.out.println(false);
    }

    public static void clear(int[] ints) {
        for (int i : ints) {
        }
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 0;
        }
        System.out.println(ints.length);
    }

    public static void arrayCopy(int[] ints) {
        int[] b = new int[ints.length];
        b = Arrays.copyOf(ints, ints.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    static void swapElements(int[] randomArray, int indexA, int indexB) {
        int tmp = randomArray[indexA];
        randomArray[indexA] = randomArray[indexB];
        randomArray[indexB] = tmp;
    }
}
