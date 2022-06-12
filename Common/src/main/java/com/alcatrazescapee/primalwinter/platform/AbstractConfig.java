package com.alcatrazescapee.primalwinter.platform;

import java.util.List;
import java.util.function.Supplier;

public abstract class AbstractConfig
{
    public void earlySetup() {}

    protected abstract BooleanValue build(Type configType, String name, boolean defaultValue, String comment);
    protected abstract DoubleValue build(Type configType, String name, double defaultValue, double minValue, double maxValue, String comment);
    protected abstract IntValue build(Type configType, String name, int defaultValue, int minValue, int maxValue, String comment);
    protected abstract ListValue<String> build(Type configType, String name, List<String> defaultValue, String comment);

    public interface BooleanValue extends Supplier<Boolean> {}
    public interface DoubleValue extends Supplier<Double> {}
    public interface IntValue extends Supplier<Integer> {}
    public interface ListValue<T> extends Supplier<List<T>> {}

    public enum Type
    {
        CLIENT,
        COMMON
    }
}
