package day05;

public class DatasForSubstring {
    private int v1Bound1;
    private int v1Bound2;
    private int v2Bound1;
    private int v2Bound2;
    private int v3Bound1;
    private int v3Bound2;

    public DatasForSubstring(int v1Bound1, int v1Bound2, int v2Bound1, int v2Bound2, int v3Bound1, int v3Bound2) {
        this.v1Bound1 = v1Bound1;
        this.v1Bound2 = v1Bound2;
        this.v2Bound1 = v2Bound1;
        this.v2Bound2 = v2Bound2;
        this.v3Bound1 = v3Bound1;
        this.v3Bound2 = v3Bound2;
    }

    public int getV1Bound1() {
        return v1Bound1;
    }

    public int getV1Bound2() {
        return v1Bound2;
    }

    public int getV2Bound1() {
        return v2Bound1;
    }

    public int getV2Bound2() {
        return v2Bound2;
    }

    public int getV3Bound1() {
        return v3Bound1;
    }

    public int getV3Bound2() {
        return v3Bound2;
    }
}
