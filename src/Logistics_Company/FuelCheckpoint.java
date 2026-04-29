package Logistics_Company;

class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String name, double dist, int exp, int act) {
        super(id, name, dist, exp, act);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "Fuel";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return 10;
        }
        return 0;
    }
}
