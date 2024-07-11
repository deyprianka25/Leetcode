class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int totalSum = 0;

        // Step 2: Iterate through the salary array to find min, max, and total sum
        for (int s : salary) {
            if (s < minSalary) {
                minSalary = s;
            }
            if (s > maxSalary) {
                maxSalary = s;
            }
            totalSum += s;
        }

        // Step 3: Calculate the sum excluding the min and max salaries
        int sumExcludingMinMax = totalSum - minSalary - maxSalary;

        // Step 4: Calculate the number of elements excluding min and max
        int count = salary.length - 2;

        // Step 5: Compute the average and return it
        return (double) sumExcludingMinMax / count;
    }

    }
