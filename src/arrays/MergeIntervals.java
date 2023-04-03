package arrays;

import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> input = new ArrayList<>();
        Interval it = new Interval(1,3);
        input.add(it);
        it = new Interval(5,9);
        input.add(it);
        it = new Interval(11,13);
        input.add(it);
        it = new Interval(15,19);
        input.add(it);
        it = new Interval(21,25);
        input.add(it);
        it = new Interval(27,30);
        input.add(it);
        it = new Interval(32,35);
        input.add(it);
        it = new Interval(36,40);
        input.add(it);

        ArrayList<Interval> ans = insert(input, new Interval(18,28));
//        System.out.println(ans.size());
        ans.stream().forEach(e -> {
            System.out.println(e.start + " " + e.end);
        });
    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ans = new ArrayList<>();
        boolean merged = false;
        for(int i = 0; i < intervals.size(); i++){ //
            Interval curr = intervals.get(i);   // 15,19   18,28  36,40
            if(! (curr.end < newInterval.start) ){ // Overlapped
                //Merge
                newInterval.start = Math.min(curr.start, newInterval.start); // 15,28
                newInterval.end = Math.max(curr.end, newInterval.end);
                merged = true;
                i++;
                boolean newIntervalAdded = false;
                while(i < intervals.size()){
                    curr = intervals.get(i);  // 21,25  27,30  32,35
                    if(curr.start > newInterval.end){ // Not Overlapped

                        if(!newIntervalAdded)
                            ans.add(newInterval);         // Add new
                        ans.add(curr);                // Add curr

                    }else{                            // Overlapped, again merge
                        newInterval.start = Math.min(curr.start, newInterval.start); // 15,28  15,30
                        newInterval.end = Math.max(curr.end, newInterval.end);
                    }
                    i++;
                }
            }else{
                ans.add(curr);
            }
        }
        if(!merged)
            ans.add(newInterval);
        return ans;
    }
}



// Definition for an interval.
class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
