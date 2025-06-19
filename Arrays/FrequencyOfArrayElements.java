public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};
        boolean[] visited = new boolean[array.length];

        System.out.println("Frequency of each element:");
        for (int i = 0; i < array.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(array[i] + " → " + count);
        }
    }
}
