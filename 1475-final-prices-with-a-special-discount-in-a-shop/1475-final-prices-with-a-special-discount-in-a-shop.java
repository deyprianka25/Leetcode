class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                answer[index] = prices[index] - prices[i];
            }
            stack.push(i);
            answer[i] = prices[i];
        }

        return answer;
    }

        
    }
