package two.task.interconnectingflights.models;

import java.util.ArrayList;

public class Solution {
    private ArrayList<Leg> legs;

    public Solution() {
        legs = new ArrayList<>();
    }

    public Solution(Solution s) {
        this.legs = new ArrayList<>(s.getLegs());
    }

    public ArrayList<Leg> getLegs() {
        return legs;
    }

    public void setLegs(ArrayList<Leg> legs) {
        this.legs = legs;
    }

    public int getStops() {
        return legs.size() - 1;
    }

    public void addLeg(Leg leg) {
        this.legs.add(leg);
    }

    @Override
    public String toString() {
        return "Solution{" +
                "legs=" + legs +
                '}';
    }
}
