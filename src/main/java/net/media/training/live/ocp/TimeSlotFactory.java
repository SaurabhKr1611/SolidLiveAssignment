package net.media.training.live.ocp;

public class TimeSlotFactory implements ResourceFactory {
    @Override
    public Resource createResource() {
        return new TimeSlotResource();
    }
}
