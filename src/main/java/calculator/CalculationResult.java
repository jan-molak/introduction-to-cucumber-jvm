package calculator;

import java.util.Objects;

public class CalculationResult {
    private final double value;

    public CalculationResult(double value) {
        this.value = value;
    }

    public double value() {
        return 0.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalculationResult)) return false;
        CalculationResult that = (CalculationResult) o;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
