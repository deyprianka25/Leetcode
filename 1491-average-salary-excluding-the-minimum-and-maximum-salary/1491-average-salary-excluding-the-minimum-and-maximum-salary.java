class Solution {
    public double average(int[] salary) {
        //SORTING
        Arrays.sort(salary);
        int totalsum = 0;
        for(int i=1;i<salary.length-1;i++){
            totalsum += salary[i];
        }
        int count = salary.length-2;
        return (double) totalsum/count;
    }
}
        //int minSalary = Integer.MAX_VALUE;
        //int maxSalary = Integer.MIN_VALUE;
        //int totalSum = 0;
        //for (int s : salary) {
            //if (s < minSalary) {
                //minSalary = s;
            //}
            //if (s > maxSalary) {
                //maxSalary = s;
            //}
            //totalSum += s;
       // }
       // int sumExcludingMinMax = totalSum - minSalary - maxSalary;
       // int count = salary.length -2;
       // return (double) sumExcludingMinMax / count;
    //}

   // }
