class Solution {
      public static int winner(List<Boolean> person, int n, int index, int person_left, int k) {
        if (person_left == 1) {
            for (int i = 0; i < n; i++) {
                if (!person.get(i)) {
                    return i;
                }
            }
        }

        int kill = (k - 1) % person_left;
        
        while (kill-- > 0) {
            index = (index + 1) % n;
            while (person.get(index)) { // skip eliminated persons
                index = (index + 1) % n;
            }
        }

        person.set(index, true); // mark the person as eliminated
        while (person.get(index)) { // find the next non-eliminated person
            index = (index + 1) % n;
        }
        
        return winner(person, n, index, person_left - 1, k);
    }

    public int findTheWinner(int n, int k) {
        List<Boolean> person = new ArrayList<>(Collections.nCopies(n, false)); // initialize with false
        return winner(person, n, 0, n, k) + 1; // +1 to convert zero-indexed to one-indexed result
    }
}
