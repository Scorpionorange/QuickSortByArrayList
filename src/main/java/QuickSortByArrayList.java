import java.util.ArrayList;


/**
 * Created by ScorpionOrange on 2016/11/23.
 * 使用可变数组进行类似于快速排序的排序：
 * 方法checkSequen用法：
 * 接收一个已排序的可变数组，及一个待比较的值；
 * 即可输出这个值在这个已排序的数值中应该插入的位置，即下标；
 *
 * 方法quickSortByArrayList用法：
 * 接收一个未排序的数组，然后新建一个为空的outputArrayList；
 * 并对为排序的数组中的每一个元素及outputArrayList使用checkSequen；
 * 并按大小插入到outputArrayList中；
 * 最后将可变数组转换成数组outputArray输出；
 */
public class QuickSortByArrayList {
    int index;
    int indexInCheck;

    public int checkSequence(ArrayList<Integer> ArrayList, int input){
        for(int i=0;i<ArrayList.size();i++){
            if (input<=ArrayList.get(i)){
                indexInCheck=i;
                break;
            }
            else {
                indexInCheck=-1;
            }
        }
        return indexInCheck;
    }

    public int[] quickSortByArrayList(int[] inputArray){
        ArrayList<Integer> outputArrayList=new ArrayList<Integer>(0);
        for(int j=0;j<inputArray.length;j++){
            index=checkSequence(outputArrayList,inputArray[j]);
            if(index==-1){
                outputArrayList.add(inputArray[j]);
            }
            else {
                outputArrayList.add(index,inputArray[j]);
            }
        }
        int[] outputArray=new int[outputArrayList.size()];
        for(int i=0;i<outputArrayList.size();i++){
            outputArray[i]=outputArrayList.get(i);
        }
        return outputArray;
    }
}

