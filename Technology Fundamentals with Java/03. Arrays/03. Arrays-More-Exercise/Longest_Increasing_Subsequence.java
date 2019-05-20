import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//Longest Increasing Subsequence (LIS)
public class Longest_Increasing_Subsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sequence = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> longestSeq = findLongestIncreasingSubsequence(sequence);
        List<String> stringList = longestSeq.stream().map(Object::toString).collect(Collectors.toList());
        System.out.printf("%s", String.join(" ", stringList));
    }

    public static List<Integer> findLongestIncreasingSubsequence(int[] sequence) {
        int[] length = new int[sequence.length];
        int[] prev = new int[sequence.length];
        int maxLength = 0;
        int lastIndex = -1;

        for (int i = 0; i < sequence.length; i++) {
            length[i] = 1;
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (sequence[j] < sequence[i] && length[j] >= length[i]) {
                    length[i] = 1 + length[j];
                    prev[i] = j;
                }
            }
            if (length[i] > maxLength) {
                maxLength = length[i];
                lastIndex = i;
            }
        }
        List<Integer> longestSeq = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            longestSeq.add(sequence[lastIndex]);
            lastIndex = prev[lastIndex];
        }
        Collections.reverse(longestSeq);
        return longestSeq;
    }
}

