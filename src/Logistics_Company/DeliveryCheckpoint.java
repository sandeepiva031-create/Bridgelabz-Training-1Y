package Logistics_Company;


class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String name, double dist, int exp, int act) {
        super(id, name, dist, exp, act);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "Delivery";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return (actualDuration - expectedDuration) * 2;
        }
        return 0;
    }
}