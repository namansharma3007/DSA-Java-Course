// Linear Search

// #include<iostream>
// using namespace std;

// int linearSearch(int arr[],int size,int key){
//     for(int i=0;i<size;i++){
//         if(key==arr[i])
//         {
//            return i;
//         }
//     }
//         return -1;

// }

// int main(){
//     int size;
//     cout<<"Enter the size of array: ";
//     cin>>size;
//     int arr[size];
//     for(int i=0;i<size;i++){
//         cin>>arr[i];
//     }
//     int key;
//     cout<<"Enter the key you want to search"<<endl;
//     cin>>key;

//     cout<<"If output is -1 then key is not present else it is index no: "<<endl;
//     cout<<linearSearch(arr,size,key)<<endl;

//     return 0;
// }


// Binary Search

#include<iostream>
using namespace std;

int binarySearch(int arr[],int size,int key){
    int start=0;
    int end=size;
    while(start<=end){
        int mid=(start+end)/2;

        if(arr[mid]==key){
            return mid;
        }
        
        else if(arr[mid]>key){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;

}

int main(){
    int size,key;
    cout<<"Enter the size of the array: ";
    cin>>size;

    int arr[size];
    for (int i=0;i<size;i++){
        cin>>arr[i];
    }
    cout<<"The array is: "<<endl;
    for (int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    cout<<"Enter the key you want to find: ";
    cin>>key;
     
    cout<<"If output is -1 then key is not present else it is index no: "<<endl;
    cout<<binarySearch(arr,size,key);


    return 0;
}