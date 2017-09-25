package structires.stack;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

class Main {
    public static void main(String arg[]) {
        Stack<String> stack = new ArrayStack<>(10);
        long last = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stack.push("item:" + (i + 1));
        }
        System.out.println("Stack:add 1000000 and time is :" + (System.currentTimeMillis() - last));
        last = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stack.pop();
        }
        System.out.println("Stack:pop 1000000 and time is :" + (System.currentTimeMillis() - last));
        System.out.println(stack.size());
    }
}
