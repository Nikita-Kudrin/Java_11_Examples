package sample.multitasking;

public class SynchronizationExample {
    // Volatile is telling JVM to get the latest value of variable from RAM, and not cached one
    private volatile int syncVolatileInt = 0;

    private final Object syncObj = new Object();

    public void someMethodWithSynchronization() {
        // synchronize access to the object
        synchronized (syncObj) {
            // do some stuff
        }
    }

    public synchronized void synchronizedMethod() {
        // do some stuff
    }

    public void accessVolatileObject() {
        syncVolatileInt++;
    }
}
