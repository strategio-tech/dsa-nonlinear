# DSA Assignment: Non-Linear Structures (REQUIRED)

Accepting the GitHub Assignment will create a repo with a series of challenges at `/src/main/java/tech.strategio` and its corresponding unit tests at `/src/test/java/tech.strategio`.

Each exercise contains a class with a method. Complete the methods in an IDE such that the unit tests pass. You should run your unit tests often, either through your Java IDE or through the command line (`gradle test`).

To submit the exercises, push a commit to GitHub. Automated tests will run, and you’ll see a green checkbox if ALL unit tests pass.

## Assignments

### E01 - Maximum Depth of Binary Tree

*Required, Difficulty rating: Medium*

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
```


NOTES:

You may have noticed our test cases take in an array. The `createBSTFromArray` method in TestE01.java takes an array of Integers (including null) and generates a tree.

Example 1:

![a tree structure](https://user-images.githubusercontent.com/33945/201712537-9f0b3f82-f9ae-4049-b6ec-d7836c7d99da.png)

```
Input: root = [3,9,20,null,null,15,7]
Output: 3
```

Example 2:
```
Input: root = [1,null,2]
Output: 2
```


## Hints

- Many of these problems have corresponding LeetCode challenges or similar. Google is your friend, but try the problem first.