package multitasking;

import common.BaseTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentExample extends BaseTest {

    // CountDownLatch: countdown to zero (from certain count of events), after that - releases the latch (threads may proceed)
    // CyclicBarrier: threads call 'await' on barrier. When certain count of threads reached - barrier invoke event.
    // Exchanger: threads will exchange data when both threads call 'exchange' method
    // Phaser: used to sync different phases of process between different threads

    Semaphore semaphore = new Semaphore(2); // only 2 threads at a time

    class SomeThread implements Runnable {
        @Override
        public void run() {
            try {
                semaphore.acquire();
                //log.info("Semaphore is acquired");
                System.out.println("Semaphore is acquired");
                // do some stuff
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    // Executors:
    // ThreadPoolExecutor
    // ScheduledThreadPoolExecutor

    @Test
    public void executorTest() throws InterruptedException {
        var numberOfThreads = 2;
        ExecutorService poolExecutor = Executors.newFixedThreadPool(numberOfThreads);

        poolExecutor.execute(new SomeThread());
        poolExecutor.execute(new SomeThread());
        poolExecutor.execute(new SomeThread());
        poolExecutor.execute(new SomeThread());
        poolExecutor.execute(new SomeThread());

        poolExecutor.shutdown();
        poolExecutor.awaitTermination(100, TimeUnit.SECONDS);
    }


    // Fork/Join Framework

    // ForkJoinPool
    // ForkJoinTask
    // ForkJoinPool
    // RecursiveTask
    // RecursiveAction

    @Test
    public void forkJoinTask() {
        var pool = new ForkJoinPool();

        var task = pool.invoke(new SomeTask());

        new SomeTask().compute();
    }

    public class SomeTask extends RecursiveAction {
        @Override
        protected void compute() {
            // do work here
        }
    }

    // Concurrent collections:
    // ConcurrentHashMap
    // ConcurrentLinkedQueue
    // CopyOnWriteArrayList


    // Flow (Reactive programming - controlling flow with use of back pressurel
    // Flow.Subscriber
    // Flow.Publisher
    // Flow.Processor
    // Flow.Subscription

    // no needs in synchronization
    AtomicInteger atomicInt = new AtomicInteger();

    @Test
    public void atomicTest() {
        atomicInt.incrementAndGet();
    }

    public String someAsyncMethod() {
        return UUID.randomUUID().toString();
    }


    @Test
    public void completableFutureAnotherExample() throws ExecutionException, InterruptedException {
        // completable future will run task in Fork/Join pool (default, or custom)

        var completableFuture = CompletableFuture.supplyAsync(() -> "Ololo");
        completableFuture = completableFuture.thenApplyAsync((item) -> item + " bla bla");

        var result = completableFuture.get();
        System.out.println(result);

        var anotherCompletableFuture = CompletableFuture.supplyAsync(this::someAsyncMethod);
        System.out.println(anotherCompletableFuture.join());
    }

}
