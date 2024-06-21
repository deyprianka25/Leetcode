class Solution {
    public int trap(int[] height) {
        int n = height.length; // Correct method to get array length
        int leftmax = 0, rightmax = 0, maxheight = height[0], index = 0;
        int water = 0; // Initialize the water variable

        // Find the highest bar and its index
        for (int i = 1; i < n; i++) { // Declare i in the loop
            if (maxheight < height[i]) {
                maxheight = height[i];
                index = i;
            }
        }

        // Calculate water trapped to the left of the highest bar
        for (int i = 0; i < index; i++) {
            if (leftmax > height[i]) {
                water += leftmax - height[i];
            } else {
                leftmax = height[i];
            }
        }

        // Calculate water trapped to the right of the highest bar
        for (int i = n - 1; i > index; i--) { // Correct loop condition
            if (rightmax > height[i]) {
                water += rightmax - height[i];
            } else {
                rightmax = height[i];
            }
        }

        return water;
    }
}
    