public class ArrayAlgorithms {
    private ArrayAlgorithms() {}
    public static double average(int[] numlist) {
        int value = 0;
        for (int num : numlist) {
            value += num;
        }
        return (double) value / numlist.length;
    }
    public static int minimum(int[] numList) {
        int minimum = numList[0];
        for (int num : numList) {
            if (minimum > num) {
                minimum = num;
            }
        }
        return minimum;
    }
    public static int howManyContain(String[] strList, String target) {
        int value = 0;
        for (String str : strList) {
            if (str.indexOf(target) != -1) {
                value++;
            }
        }
        return value;
    }
    public static String[] stringToArray(String myStr) {
        String character = "";
        String[] strList = new String[myStr.length()];
        for (int i = 0; i < strList.length; i++ ) {
            character = myStr.substring(i, i +1);
            strList[i] = character;
        }
        return strList;
    }
    public static void introduceAdults(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() >= 18) {
                people[i].introduce();;
            }
        }
    }
    public static void reversePrint(String[] wordList) {
        for (int f = wordList.length - 1; f > -1; f--) {
            for (int i = wordList[f].length() - 1; i > -1; i--) {
                System.out.print(wordList[f].substring(i, i +1));
            }
            System.out.println();
        }
    }
    public static int[] combine(int[] arr1, int[] arr2) {
        int[] combineArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
                combineArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combineArr[i + arr1.length] = arr2[i];
        }
        return combineArr;
    }
}
