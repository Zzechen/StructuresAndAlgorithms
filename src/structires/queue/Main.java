package structires.queue;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

class Main {
    public static void main(String arg[]) {
        ArrayQueue<String> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.offer("item" + i);
        }
        Queue<String> queue2 = new ArrayQueue<>();
        long last = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            queue2.offer("item" + i);
        }
        System.out.println("ArrayQueue:offer 1000000 and time is :" + (System.currentTimeMillis() - last));
        last = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            queue2.poll();
        }
        System.out.println("ArrayQueue:poll 100000 and time is :" + (System.currentTimeMillis() - last));
    }
}
