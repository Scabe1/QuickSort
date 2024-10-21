# QuickSort
QuickSort Implementation for Custom IList Data Structure

Project Overview
This project implements the QuickSort algorithm to sort a custom `IList<Integer>` data structure. The algorithm sorts a list of integers using a recursive, partition-based approach. It includes custom methods for partitioning and swapping elements within the list, and is designed to avoid the use of standard Java collections.

This project demonstrates core concepts of data structures and algorithms, such as recursion and efficient sorting techniques, while adhering to the limitations of the custom `IList` interface.

Features
- Quicksort Algorithm: Efficient, recursive sorting technique.
- Partitioning Method: Partitions the list based on a pivot element.
- Custom Data Structure: Works on the custom `IList` interface provided in the assignment.
- Swap Functionality: Custom method to swap two elements in the list.

How It Works
1. Quicksort Method: Takes in an `IList<Integer>` and sorts it in-place.
2. Partition Method: Chooses the last element as the pivot and partitions the list around it.
3. Recursive Sorting: Recursively sorts sub-arrays around the pivot.
4. Swap Method: Swaps elements in the list during the partitioning process.

Code Structure
- `quicksort(IList<Integer> list)`: Initiates the QuickSort algorithm.
- `quicksortHelper(IList<Integer> list, int low, int high)`: Recursive helper method to sort sub-arrays.
- `partition(IList<Integer> list, int low, int high)`: Partitions the list using a pivot element.
- `swap(IList<Integer> list, int i, int j)`: Swaps two elements in the list.


How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/QuickSort-IList.git
   ```
2. Compile the project:
   ```bash
   javac MySorts.java
   ```
3. Run the main class to test sorting:
   ```bash
   java Main
   ```

Example
Here's an example of sorting a custom `IList` of integers using the QuickSort algorithm:
```java
IList<Integer> list = new MyArrayList<>();
list.add(10);
list.add(3);
list.add(6);
list.add(1);
MySorts.quicksort(list);
System.out.println(list);
```
