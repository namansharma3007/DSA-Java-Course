#include <iostream>
using namespace std;

int stack[5], top = -1, item;
// top=-1 for every stack initial value
#define max 5
// max elements we ca entr into a stack

// stack push operatin

// push - first increment value of top then put iten at that position

void push()
{
    if (top >= max - 1)
    {
        cout << "Stack overflow/full" << endl;
    }
    else
    {
        cout << "Enter element" << endl;
        cin >> item;
        top++;
        stack[top] = item;
    }
}

// pop - store stact[top] in a variable and so top--

void pop()
{
    if (top == -1)
    { // top = -1 initial state which is empty state
        cout << "Stack is underflow/empty" << endl;
    }
    else
    {
        item = stack[top]; // storing stack of top in the variable
        top--;             // decrementing top
        cout << "Deleted element is :" << item << endl;
    }
}

void display()
{ // stack representation is from top to 0
    int i;
    if (top == -1)
    {
        cout << "Stack is empty" << endl;
    }
    else
    {
        cout << "Stack is :\n"
             << endl;
        for (i = top; i >= 0; i--)
        {
            cout << stack[i] << endl;
        }
    }
}

int main()
{
    int choice, loop;
    int n;

    do
    {
        // scanning choice from user
        cout << "Enter your choice" << endl;
        cout << "1) push" << endl;
        cout << "2) pop" << endl;
        cout << "3) display" << endl;

        cin >> choice;
        // switch case to check which operation user want to do
        switch (choice)
        {
        case 1: // while push operation user can push multiple elements
            cout << "Enter the no of elements to be inserted into stack" << endl;
            cin >> n;
            for (int i = 0; i < n; i++)
            {
                push();
            }
            break;
        case 2:
            pop();
            break;
        case 3:
            display();
            break;
        default:
            cout << "Your selection is invalid" << endl;
        }
        cout << "Do you want to continue : enter 1 else 0" << endl; // loop = 0 while loop will het terminated
        cin >> loop;
    } while (loop != 0);

    return 0;
}