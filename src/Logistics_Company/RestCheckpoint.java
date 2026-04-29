package Logistics_Company;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String name, double dist, int exp, int act) {
        super(id, name, dist, exp, act);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "Rest";
    }

    double calculatePenalty() {
        if (isDelayed() && (actualDuration - expectedDuration) > 30) {
            return (actualDuration - expectedDuration) * 0.5;
        }
        return 0;
    }
}
