// # include<iostream>
// using namespace std;

// void display(int arr[],int n){
//     //Code for Traversal
//     for (int i=0;i<n;i++){
//         cout<<arr[i]<<" ";
//         }
//         cout<<endl;
// }
// int indInsertion(int arr[],int size,int element,int capacity,int index){
//     // Code for Insertion
//     if(size>=capacity){
//         return -1;
//     }
//     for (int i = size-1; i >= index; i--)
//     {
//         arr[i+1]=arr[i];
//     }
//     arr[index]=element;
//     return 1;
// }

// int main(){
//     int arr[100]={7,8,12,27,88};
//     int size =5,element =45,index=3;
//     display(arr,size);
//     indInsertion(arr,size,element,100,index);
//     size+=1;
//     display(arr,size);
//     return 0;
// }

// Insertion + Traversal

// #include <iostream>
// using namespace std;

// int main()
// {
//     int arr[50], size, insert, i, index;
//     cout << "Enter array size: ";
//     cin >> size;
//     cout << "Enter array elements:\n";
//     for (i = 0; i < size; i++)
//     {
//         cin >> arr[i];
//     }
//     cout << "Array is:\n";
//     for (i = 0; i < size; i++)
//     {
//         cout << arr[i] << " ";
//     }
//     cout << endl;
//     cout << "Enter element to be inserted: ";
//     cin >> insert;
//     cout << "Enetr position or index no: ";
//     cin >> index;
//     for (i = size; i > index; i--)
//     {
//         arr[i] = arr[i - 1];
//     }
//     arr[index] = insert;
//     size += 1;
//     cout << "New array is:\n";
//     for (i = 0; i < size; i++)
//     {
//         cout << arr[i] << " ";
//     }

//     return 0;
// }


// Deletion in Array

#include<iostream>
using namespace std;

int main(){
    int arr[50],size,i,del,count=0;
    cout<<"Enter array size: ";
    cin>>size;
    cout<<"Enter array elements:\n";
    for(i=0;i<size;i++){
        cin>>arr[i];
    }
    for(i=0;i<size;i++){
        cout<<arr[i]<<" ";
        }
    cout<<endl;
cout<<"Enter element to be deleted: ";
cin>>del;
for (i=0;i<size;i++){
    if(arr[i]==del)
    {
    for(int j=i;j<size-1;j++)
           {
           arr[j]=arr[j+1];
           }
    count++;
    break;
    }
}
if(count==0){
    cout<<"Element not found";
}
else{
    cout<<"New array: \n";
    for (i=0;i<(size-1);i++)
    {
        cout<<arr[i]<<" ";
    }
}

    return 0;
}