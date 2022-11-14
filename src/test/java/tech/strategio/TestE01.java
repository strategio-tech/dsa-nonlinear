package tech.strategio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.stream.Stream;

public class TestE01 {

    /**
     * see https://bit.ly/3g28LL7
     * @return A generated BST
     */
    public TreeNode createBSTFromArray(Integer[] data) {
        if (data[0] == null) {
            return null;
        }
        TreeNode root = new TreeNode(data[0]);
        form(root, 0, data);
        return root;
    }

    private void form(TreeNode root, int rootIndex, Integer[] data) {
        int n = data.length;

        int leftIndex = 2 * rootIndex + 1;
        if (leftIndex < n && null != data[leftIndex]) {
            root.left = new TreeNode(data[leftIndex]);
            form(root.left, leftIndex, data);
        }

        int rightIndex = 2 * rootIndex + 2;
        if (rightIndex < n && null != data[rightIndex]) {
            root.right = new TreeNode(data[rightIndex]);
            form(root.right, rightIndex, data);
        }
    }

    @DisplayName("FIXME")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("argumentStream")
    // replace int[] and Boolean with the appropriate types
    void argumentStream(Integer[] values, int result) {
        TreeNode tree = createBSTFromArray(values);
        E01 exercise = new E01();
        int val = exercise.maxDepth(tree);
        assertEquals(result, val);
    }

    private static Stream<Arguments> argumentStream() {
        return Stream.of(
                Arguments.arguments(new Integer[] { null }, 0),
                Arguments.arguments(new Integer[] { 5 }, 1),
                Arguments.arguments(new Integer[] { 3,9,20, null, null, 15, 7 }, 3),
                Arguments.arguments(new Integer[] { 1, null, 2 }, 2)
        );
    }
}
