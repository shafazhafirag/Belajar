#include <iostream>
using namespace std;

struct DataKaryawan{
    string nama,jabatan,email,alamat;

    DataKaryawan *prev;
    DataKaryawan *next;
};

DataKaryawan *head, *tail, *cur, *newNode;

//funcion create double link
void createDoubleLinkedList(string data[4]){

    head = new DataKaryawan();
    head->nama = data[0];
    head->jabatan = data[1];
    head->email = data[2];
    head->alamat = data[3];
    head->prev = NULL;
    head->next = NULL;
    tail = head;
}
//function AddFirst
void addFirst(string data[4]){
    if(head == NULL){
        cout << "Double Linked List Belum diBuat";
    }else{
        newNode =  new DataKaryawan();
        newNode->nama = data[0];
        newNode->jabatan = data[1];
        newNode->email = data[2];
        newNode->alamat = data[3];
        newNode->prev = head;
        newNode->next = NULL;
        head->prev = newNode;
        head = newNode;
    }
}
//function addlast
void addLast(string data[4]){
    if(head == NULL){
        cout << "Double Linked List Belum diBuat";
    }else{
        newNode =  new DataKaryawan();
        newNode->nama = data[0];
        newNode->jabatan = data[1];
        newNode->email = data[2];
        newNode->alamat = data[3];
        newNode->prev = tail;
        newNode->next = NULL;
        tail->next = newNode;
        head = newNode;
    }
}
//function print linked list
void printDoubleLInkList(){
    cur = head;
    while(cur != NULL){
        cout << "Nama Karyawan : " << cur->nama << "\n";
        cout << "Jabatan : " << cur->jabatan << "\n";
        cout << "Email : " << cur->email << "\n";
        cout << "Alamat : " << cur->alamat << "\n" << "\n";

        cur = cur->next;
    }
}
int main(){
    string data[4] = {"SHAFA Zhafira Gunvany","Web Developmer","shafazhafiira.g@gmail.com","Serdang Asri 2 Paongan Citra Raya"};
    createDoubleLinkedList(data);
    printDoubleLInkList();

    string data2[4] = {"Hafa Fira Vany","IT Manager","hafiny@gmail.com","Pasar Lama Tangerang"};
    addFirst(data2);
    printDoubleLInkList();

    string data3[4] = {"Fira","Android Developer","fira@gmail.com","Taman Palm Cengkareng"};
    addLast(data3);
    printDoubleLInkList();
}