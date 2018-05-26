package removeAddArrayElements;

public class ChangableArray {
    int data[] = new int[100];
    int dataIndexTrack = 0;
    public void output(){
        for (int index = 0;index < dataIndexTrack; index++) {
            System.out.print(data[index] + " ");
        }
        System.out.println();
    }
    public void append(int element){
        data[dataIndexTrack] = element;
        dataIndexTrack++;
    }
    public void remove(int element){
        System.out.println("Remove "+ element);
        int index = find(element);
        if(index != -1){
            shiftForwardFrom(index);
        }
    }

    private void shiftForwardFrom(int indexFrom) {
        for (int index = indexFrom;index < dataIndexTrack; index++) {
            data[index] = data[index+1];
        }
        dataIndexTrack--;
    }

    private int find(int element) {
        for (int index = 0;index < dataIndexTrack; index++) {
            if(data[index] == element)
                return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        ChangableArray changableArray = new ChangableArray();
        System.out.println("Appending Elements");
        changableArray.append(50);
        changableArray.output();
        changableArray.append(20);
        changableArray.output();
        changableArray.append(234);
        changableArray.output();
        changableArray.append(16);
        changableArray.output();
        changableArray.append(33);
        changableArray.output();
        changableArray.append(82);
        changableArray.output();
        changableArray.append(22);
        changableArray.output();
        changableArray.append(1142);
        changableArray.output();

        System.out.println();

        changableArray.remove(234);
        changableArray.output();
        System.out.println();
        changableArray.remove(50);
        changableArray.output();
    }
}
