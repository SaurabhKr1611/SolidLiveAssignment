package net.media.training.live.ocp;

public class SpaceSlotFactory implements ResourceFactory{

    @Override
    public Resource createResource() {
        return new SpaceSlotResource();
    }
}
