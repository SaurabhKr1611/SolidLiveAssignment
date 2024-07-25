package net.media.training.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceFactory factory) {
        Resource resource = factory.createResource();
        return resource.allocate();
    }

    public void free(ResourceFactory factory, int resourceId) {
        Resource resource = factory.createResource();
        resource.free(resourceId);
    }
}
