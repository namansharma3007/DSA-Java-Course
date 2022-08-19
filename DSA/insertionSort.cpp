#include <iostream>
using namespace std;

/* Insertion Sort*/

void insertionSort(int arr[], int size)
{
    int temp;
    int minIndex;
    for (int i = 0; i < size - 1; i++)
    {
        minIndex=i;
        for (int j = i+1; j < size; j++)
        {
            if (arr[minIndex] > arr[j])
            
                 minIndex=j;
            }
            
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    

void printArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main()
{
    int arr[] = {4, 3, 5, 1, 2};
    int size = (sizeof(arr) / sizeof(int));

    cout << "Unsorted array: ";
    printArray(arr, size);

    insertionSort(arr, size);

    cout << "Sorted array: ";
    printArray(arr, size);

    return 0;
}