#### [1.冒泡排序](BubbleSort.java)
![image](https://github.com/Zzechen/StructuresAndAlgorithms/blob/master/src/algorithms/imgs/sort_bubble_anim.gif)  
`图片来自维基百科`  
相邻位置比较置位  

|     类目    |    复杂度   |  
| ----------- | ----------- |  
|     最坏    |    O(n2)   |   
|     最优    |    O(n2)   |  
|     平均    |    O(n2)   |  
|     空间    |    总O(n)+辅助O(1)   |
#### [2.选择排序](SelectSort.java)
![image](https://github.com/Zzechen/StructuresAndAlgorithms/blob/master/src/algorithms/imgs/sort_selection_anim.gif)  
`图片来自维基百科`  
固定位置与后续位置的比较置位

|     类目    |    复杂度   |  
| ----------- | ----------- |  
|     最坏    |    O(n2)   |   
|     最优    |    O(n2)   |  
|     平均    |    O(n2)   |  
|     空间    |    总O(n)+辅助O(1)   |
#### [3.快速排序](QuickSort.java)
![image](https://github.com/Zzechen/StructuresAndAlgorithms/blob/master/src/algorithms/imgs/sort_quicksort_anim.gif)  
`图片来自维基百科`  
递归，分治

|     类目    |    复杂度   |  
| ----------- | ----------- |  
|     最坏    |     O(n2)  |   
|     最优    |     O(nlogn)  |  
|     平均    |     O(nlogn)  |  
|     空间    |     ---   |
#### [4.插入排序](InsertSort.java)
![image](https://github.com/Zzechen/StructuresAndAlgorithms/blob/master/src/algorithms/imgs/sort_insertion_anim.gif)  
`图片来自维基百科`  
后面的元素与前面排好序的元素比较置位

|     类目    |    复杂度   |  
| ----------- | ----------- |  
|     最坏    |     O(n2)  |   
|     最优    |     O(n2)  |  
|     平均    |     O(n2)  |  
|     空间    |     总O(n)+辅助O(1)   |
#### [5.希尔排序](ShellSort.java)
![image](https://github.com/Zzechen/StructuresAndAlgorithms/blob/master/src/algorithms/imgs/sort_shell_anim.gif)  
`图片来自维基百科`  
分组，排列成二维数组，并对列排序；循环多次；(操作大于交换,**希尔增量，Hibbard增量**)

|     类目    |    复杂度   |  
| ----------- | ----------- |  
|     最坏    |     O(nlog2n)()  |   
|     最优    |     O(n)  |  
|     平均    |     --- |  
|     空间    |     O(n)   |
#### [6.堆排序](HeapSort.java)
![image](https://github.com/Zzechen/StructuresAndAlgorithms/blob/master/src/algorithms/imgs/sort_heap_anim.gif)  
`图片来自维基百科`  
递归，分治

|     类目    |    复杂度   |  
| ----------- | ----------- |  
|     最坏    |     O(nlogn)  |   
|     最优    |     O(nlogn)  |  
|     平均    |     O(nlogn)  |  
|     空间    |     总O(n)+辅助O(1)   |
#### [7.归并排序](MergeSort.java)
![image](https://github.com/Zzechen/StructuresAndAlgorithms/blob/master/src/algorithms/imgs/sort_merge_anim.gif)  
`图片来自维基百科`  
将两个已排序好的数组合并排序；分为迭代法和递归法

|     类目    |    复杂度   |  
| ----------- | ----------- |  
|     最坏    |     O(nlogn)  |   
|     最优    |     O(n)  |  
|     平均    |     O(nlogn)  |  
|     空间    |     O(n)   |