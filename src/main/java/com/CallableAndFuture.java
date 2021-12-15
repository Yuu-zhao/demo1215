package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // final ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        // Executors.newCachedThreadPool()
        final ExecutorService executorService = new ThreadPoolExecutor(0,
                Integer.MAX_VALUE,
                60L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());
        /*final Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });*/
        final CompletionService<Integer> cs = new ExecutorCompletionService<>(executorService);

        List<Future<List<String>>> resultList=new ArrayList<Future<List<String>>>();

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            cs.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int i1 = new Random().nextInt();
                    Thread.sleep(1000);
                    return i1;
                }
            });
        }

        for (int i = 0; i < 5; i++) {
            try {
                //Thread.sleep(2000);
                System.out.println(cs.take().get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }
}
