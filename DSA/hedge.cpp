#include <iostream>
using namespace std;

int N = 0;
int Tree[100];

void insertToMaxHeap(int item)
{
    N = N + 1;
    int ptr = N;
    while (ptr > 1)
    {
        int par = ptr / 2;
        if (item <= Tree[par])
        {
            Tree[ptr] = item;
            return;
        }
        Tree[ptr] = Tree[par];
        ptr = par;
    }
    Tree[1] = item;
}
void printHeap()
{
    for (int i = 1; i <= N; i++)
        cout << Tree[i] << " ";
    cout << endl;
}

int main()
{
    insertToMaxHeap(20);

    insertToMaxHeap(21);
    insertToMaxHeap(22);
    insertToMaxHeap(2);
    insertToMaxHeap(24);

    printHeap();
}
