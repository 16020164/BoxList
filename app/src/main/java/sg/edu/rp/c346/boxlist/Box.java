package sg.edu.rp.c346.boxlist;

public class Box {

    private boolean firstBox;
    private boolean secondBox;
    private boolean thirdBox;

    public Box(boolean firstBox, boolean secondBox, boolean thirdBox) {
        this.firstBox = firstBox;
        this.secondBox = secondBox;
        this.thirdBox = thirdBox;
    }

    public boolean isFirstBox() {
        return firstBox;
    }

    public void setFirstBox(boolean firstBox) {
        this.firstBox = firstBox;
    }

    public boolean isSecondBox() {
        return secondBox;
    }

    public void setSecondBox(boolean secondBox) {
        this.secondBox = secondBox;
    }

    public boolean isThirdBox() {
        return thirdBox;
    }

    public void setThirdBox(boolean thirdBox) {
        this.thirdBox = thirdBox;
    }

    @Override
    public String toString() {
        return "Box{" +
                "firstBox=" + firstBox +
                ", secondBox=" + secondBox +
                ", thirdBox=" + thirdBox +
                '}';
    }
}
