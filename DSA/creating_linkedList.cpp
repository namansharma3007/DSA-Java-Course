#include<iostream>

using namespace std;

class node{
    public:
    int data;
    node* next;

    node(int val){
        data=val;
        next=NULL;
    }

};

void insertAthead(node* &head,int val){
    node*n=new node(val);
    n->next=head;
    head=n;

}

void insertAtTail(node* &head,int val){
    node*n=new node(val);
    node *temp=head;

    if(head==NULL){
        head=n;
        return;
    }
    
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;

}
bool search(node *head,int key){
    node*temp=head;
    while(temp!=NULL){
        if(temp->data==key){
            return true;
        }
        temp=temp->next;
    }
    return false;
}

void display(node*head){
    node*temp=head;  // Here if we had taken head directly it would not have made any difference. Even head will traverse
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}

int main(){

    node*head=NULL;
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    display(head);
    insertAthead(head,5);
    display(head);
    cout<<search(head,3)<<endl;


    return 0;
}