package demo1;

public class Array {
    public static void main(String[] args) {
        int max=0;
        int[]a={1,5,6,9,7,2,3,4,0};    //创建一个数组，并且再创建的时候赋初值
        for(int i=0;i<a.length;i++)    //对数组下标从头到尾进行遍历
        {
            if(max<a[i])    //如果数组小标对应的值大于max的话，就将该下标对应的值赋值给max/
            {
                max=a[i];
            }
        }
        System.out.println("最大值= "+max);      //输出max
        System.out.println("数组长度= "+a.length); //输出数组长度
    }
}
