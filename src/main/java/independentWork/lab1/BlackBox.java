package independentWork.lab1;

import java.util.Objects;

public class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof BlackBox)) return false;
//        BlackBox blackBox = (BlackBox) o;
//        return varA == blackBox.varA &&
//                varB == blackBox.varB;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(varA, varB);
//    }
}
