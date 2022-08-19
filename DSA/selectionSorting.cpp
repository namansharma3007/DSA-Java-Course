#include <iostream>
using namespace std;

/* Selection Sort*/

void selectionSort(int arr[], int size, int temp)
{
    for (int i = 0; i < size - 1; i++)
    {
        int minIndex = i;
        for (int j = i + 1; j < size; j++)
        {
            if (arr[minIndex] > arr[j])
            
                minIndex = j;
            
        }
        temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

int main()
{
    int arr[] = {5, 4, 1, 3, 2};
    int size = (sizeof(arr) / sizeof(int));
    int minIndex;
    int temp;

    cout << "Unsorted array: ";
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    selectionSort(arr, size, temp);

    cout << "Sorted array: ";
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}