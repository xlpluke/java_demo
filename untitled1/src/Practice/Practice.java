package Practice;

interface Playable {
    void play();

    default void pause() {
        System.out.println("暂停播放...");
    }
}

interface Recordable {
    void record();
}

class SmartSpeaker implements Playable, Recordable {
    private int playCount = 0;

    @Override
    public void play() {
        if(playCount>=3){
            System.out.println("设备过热，请稍后再试");
        }else{
            playCount++;
            System.out.println("第"+playCount+"次播放中...");
        }
    }

    @Override
    public void pause() {
        System.out.println("暂停，当前播放次数："+playCount);
    }

    @Override
    public void record() {
        System.out.println("开始录音...");
    }
}

//======================第二题================================

interface IntTransformer {
    int transform(int input);
}

class Calculator {
    public static int[] processArray(int[] arr, IntTransformer transformer) {
        int[] result = new int[arr.length];
        // TODO: 遍历 arr, 用 transformer.transform() 处理每个元素, 存入 result
        return result;
    }

    public static void printArray(int[] arr) {
        // TODO: 打印数组, 格式如 [1, 2, 3]
        // 提示: 可以用 Arrays.toString(arr)
    }
}

public class Practice {
    public static void main(String[] args) {
        // ---------- 第一题测试 ----------

        SmartSpeaker speaker = new SmartSpeaker();

        for(int i=0;i<4;i++){
            speaker.play();
        }

        speaker.record();
        speaker.pause();
        // ---------- 第二题测试 ----------
        int[] numbers = {1, 2, 3, 4, 5};

        // TODO: 用 Lambda 定义"乘以2", 命名为 timesTwo
        // TODO: 调用 Calculator.processArray 处理 numbers, 结果存入 doubled, 打印

        // TODO: 用 Lambda 定义"加10", 命名为 plusTen
        // TODO: 把 doubled 再传入 processArray 用 plusTen 处理, 打印最终结果
    }
}