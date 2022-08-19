/* Implementation a singly linked list with following options in c++
i.  Create List
ii. Display  list
iii.Insertion of a node at a)At start b)In-netween c)At end
iv. Deletion of a node from any location a) start node b) In-between node c) End node
v.  Search node
vi. Display node
*/

#include<iostream>        // i/o header files
#include<cstdio>
#include<cstdlib>         //memory allocation function in stdlib.h header file

using namespace std;

struct node               //Node Declaration
{
    int info;             //First part of node i.e. info (Data)
    struct node *next;    //Second part of node i.e. next (Address)
}*start;                  //Stored address of firdt node i.e. start (header node)

class single_list
{
    public:

    node* create_node(int);
            void insert_begin();
            void insert_pos();
            void insert_last();
            void delete_pos();
            void search();
            void display();

    single_list()           //Single Linked List Function
    {
     start=NULL;            //initially Linked List Empty
    }        
};

main()                      // First function to run the program
{
  int choice, nodes, elements, position, i;    //Variable declaration
  single_list sl;                              //Single Linked List class denoted sl
  start=NULL;                                  //Initially Single Linked List in Empty

   while (1)
   {
       cout<<endl<<"Operations on singly linked list"<<endl; //After running, First Message
       cout<<"1.Insert Node at begining"<<endl;          //choice 1: insert at beginning
       cout<<"2.Insert node at last"<<endl;              //choice 2: insert at last
       cout<<"3.Insert node at position"<<endl;          //choice 3: insert at any position or middle
       cout<<"4.Delete a Particular Node"<<endl;         //choice 4: delete any node accoeding position
       cout<<"5.Search Element"<<endl;                   //choice 5: search element
       cout<<"6.Display Linked List"<<endl;              //choice 6: display all nodes in Linked List
       cout<<"7.Exit"<<endl;                             //choice 7: exit

       cout<<"Enter your choice : ";                     //Enter your choice
       cin>>choice;                                      //Choice stored in ch

       switch(choice)                                    //Select one choice from multiple choice
       {
           case 1:
           cout<<"Inserting Node at Beginning: "<<endl;  //choice 1: insert at beginning
           sl.insert_begin();                            //call insert_begin function
           cout<<endl;                                   //go to new choice
           break;

           case 2:
           cout<<"Insert Node at Last: "<<endl;          //choice 2: insert at last
           sl.insert_last();                             //call insert_last function
           cout<<endl;
           break;

           case 3:
           cout<<"Insert Node at a given position: "<<endl; //choice 3: insert at any position or middle
           sl.insert_pos();                                 // call insert_pos function
           cout<<endl;
           break;

           case 4:
           cout<<"Delete a particular node: "<<endl;        //choice 4: delete any node accoeding position
           sl.delete_pos();                                 //call delete function
           break;

           case 5:
           cout<<"Search element in a Link List: "<<endl;   //choice 5: search element
           sl.search();                                     //call search function
           break;

           case 6:
           cout<<"Diplay elemets of a Link List: "<<endl;   //choice 6: display all nodes in Linked List
           sl.display();                                    //call display function
           break;

           case 7:
           cout<<"Exiting... "<<endl;                       //choice 7: exit from code
           exit(1);                                         //print message exit
           break;
            
           default:
           cout<<"Wrong Choice"<<endl;                      //choice other then 1to 7

       }
    }
}

node *single_list::create_node(int value)    //Create Node (* = provide address to sll).
                                             //syntax = struct name *classname::function name(parameters)
{
    struct node *temp, *s;                   //Variables declaration: temp = operations performing node (Node name)
    temp = new(struct node);                 //Allocation memory to each node. New operator is used.

    if(temp == NULL)                         //temp value is null
    {
        cout<<"Memory not allocated "<<endl;  //memory not allocated
        return 0;
    }
    else
    {
        temp->info=value;                    //otherwise temp node info part saves value/data
        temp->next=NULL;                     //temp node next part saves address.
        return temp;                         //Return node. One node completed.
    }
}

void single_list::insert_begin()             //Insert element at beginning
{
    int value;
    cout<<"Enter teh value to be inserted: ";//Variable initialization. Value=Insert Value
    cin>>value;

    struct node *temp, *p;
    temp = create_node(value);               //For insertion firtsly you have to create node i.e. temp

    if (start == NULL)                       //If start or head value null means no element in list
    {
        start =temp;                         //Address of temp node stored into start or head
        start->next=NULL;                    //Only one node in list
    }
    else
    {
        p=start;       //initially start =p, p means before insertion !st & after insertion node in list
        start=temp;                         // Temp address stored into start or head node
        start->next =p;                     // Next part of temp node stored address of next node i.e. p
    }
    cout<<"Element Inserted at beginning "<<endl;  //success msg
}

void single_list::insert_last()             //Insert node at Last of list
{
    int value;
    cout<<"Enter the value to be inserted: ";  //Enter value of node
    cin>>value;

    struct node *temp, *s;
    temp=create_node(value);                   //if node not created first create it i.e. temp node.
    s=start;                                   //start address stored into 's' variable for temporary

    while (s->next !=NULL)  //insert node at last, do traversing from node to Last node
    {
        s=s->next;  //'s' used for traversing each node according the linked address. upto s->next = NULL(last node)
    }

    temp->next=NULL;        //After reached last node, insert temp node. next part stored ull value bcz it's last node
    s->next=temp;           //Initial last node i.e. 's' stored address of new last node i.e. 'temp' in there next part

    cout<<"Element inserted at last"<<endl;  //success msg
}

void single_list::insert_pos()                  //Insert node at given position
{
    int value, pos, counter=0;                  //pos=position of insertion node. counter=0 start traversing from o to position
    cout<<"Enter the value to be inserted: ";   //enter value of insertion node
    cin>>value;                                 //value read

    struct node *temp, *s, *ptr;
    temp=create_node(value);                    //If node not created firts create it i.e. temp

    cout<<"Enter the position at which node to be inserted: "; //Positio of new inserting node
    cin>>pos;                                                  //position stored into 'pos' variable

    int i;
    s=start;                       //Start or head address stored into s. s temporary used for traversing

    while(s !=NULL)                //traverse node first to last according to positon
    {
        s=s->next;                 //s points to next part of node
        counter++;                 //counter++ upto given position
    }
    if(pos == 1)                   //if 1:positon is first
    {
        if (start == NULL)
        {
        if(start=temp);            //newnode i.e. temp address atored into start or hrad
        start->next=NULL;          //next part of temp node is null. Only one node in list
        }
        else
        {
            ptr=start;             //otherwise multiple nodes present in list
            start=temp;            //start stored address of firts node
            start->next=ptr;       //remaining all node shown by 'ptr'
        }
    }  
    else if(pos>1 && pos <=counter)  //if 3: positiom is greater than one
    {
        s=start;                     //teemporary 's' stored address of first node
        for(i = 1;i < pos; i++)      //for loop used for reached the given position, 1 to pos
        {
            ptr=s;                   //'s' means next node of newely inserted i.e 'temp' node
            s=s->next;               //traversing done
        }
        ptr->next=temp;  /*'ptr' means previous node of newely inserted i.e 'temp' node
                         which stored address of next node i.e.temp*/
        temp->next=s;          //next part of temp stored address of next node i.e. 's'
    }
                                   //sequence is " 'ptr' -> 'temp' -> 's' "
        else
    {
        cout<<"Position out of range"<<endl;  //position not found
    }
}

void single_list::delete_pos()    //Delete element at a any given position of linked list
{
    int pos, i, counter=0;        //variable decalration

    if (start==NULL)              //if 1: start is null, list is empty, Deletion is not performed
    {
        cout<<"List is empty"<<endl; //display msg
        return;
    }

    cout<<"Enter the position of value to be deleted: "; //Otherwise enter position of node thet will be deleted
    cin>>pos;                                            //position no. is read and stored into pos.

    struct node *s, *ptr;                           // 'ptr' =previous node, 's'=deleted node
    s=start;                                        //start adress stored into s,s used for traversing of nodes purpose

    if(pos==1)                                    // if 2: deleted position is first(1)
    {
        start=s->next;                            //start points to next or second made Location, start stored address of 2nd node
    }                                                //so, firts ndoe automatically
    else
    {
        while(s !=NULL)                    //deleted position is other than 1,do traversing upto null. i.e. last node in LL
        {
            s=s->next;                        // s points to the next part of each node according address
            counter++;                        // traversing done upto position or last node present
        }

        if(pos > 0 && pos <= counter)       //of position greater then 0, less than counter value
        {                                     //(count of present total nodes)
          s=start;
          for (i=1;1<pos;i++)                //for loop used for traversing, 1 to position only
          {
              ptr=s;                          //previous node of deletion node called as 'ptr'.'s' stored into that
              s=s->next;                      //move next upto deleted node position. (Node present in between of two nodes)
            }                                   
            ptr->next=s->next;                //previous node of deleted node i.e 'ptr' next part stored address of deleted node
        }                                      //Sequence 'ptr' -> 's->next'
        else
        {
            cout<<"Position out of range"<<endl;          //position nnot available in linked list
        }
        free(s);                                         //free() deleted node i.e. 's'. Memory deallocatiom function
        cout<<"Element Deleted"<<endl;                     //success message
    }
}

void single_list::search()                               //Searching an element in SLL
{
    int value, pos=0;                                    //Value to be search, start from position=0
    bool flag=false;                                     //when value not found in sll

    if(start==NULL)  // Firts chech list is empty? start value is nll, we can't perform search operations
    {
        cout<<"List is empty"<<endl;    //display msg
        return;
    }

    cout<<"Enter teh value to be searched: ";  //otherwise enter value to be searched
    cin>>value;                                //search value read in 'value variable'

    struct node *s;                           //'s' = searching node
    s=start;                                  //searching/traversing start from firts node

    while(s !=NULL)                           //Searching performed upto last node. i.e. next part is null
    {
        pos++;                                //Time of searching positon increamented from one to last

        if (s->info==value)                   //if 's' node value exactly matched with givrn value
        {
            flag=true;                        //condition true(1)
            cout<<"Element "<<value<<" is found at position "<<pos<<endl;  //display msg
        }
        s=s->next;                           //Searching performed according to next or address pattern
    }
    if(!flag)                                //if flag is false(0)
    cout<<"Element "<<value<<" not found in the list"<<endl;   //Display msg of not found
}

void single_list::display()                 //Display alll elements of a Link List
{
   struct node *temp;

   if(start==NULL)                          //if list is empty
   {
       cout<<"The list is Empty"<<endl;     //display msg
       return;
   } 
   temp=start;

   cout<<"Elements of list are: "<<endl;

   while(temp !=NULL)                      //Display all nodes upto last node next part is Null
   {
       cout<<temp->info<<"->";             //Print values of all nodes in linked list
       temp=temp->next;                    //traversed every nodes in list
   }
   cout<<"NULL"<<endl;
}