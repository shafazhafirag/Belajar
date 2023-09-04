#include <iostream>
using namespace std;


struct antrianTokoGame{
    //deklarasi member
    string nama;
    int umur;

    antrianTokoGame *next;
};

int maksimalAntrianTokoGame = 5;
antrianTokoGame *head, *tail, *cur, *del, *newNode;

//Operasi count
int countLinkedList(){
    if(head == NULL){
        return 0;
    }else{
        int banyak = 0;
        cur = head;
        while(cur != NULL){
            cur = cur->next;
            banyak++;
        }
        return banyak;
    }
}
//Operasi isFull
bool isFullLinkedList(){
    if(countLinkedList() == maksimalAntrianTokoGame){
        return true;
    }else{
        return false;
    }
}
//Operasi isEmpty
bool isEmptyLinkedList(){
    if(countLinkedList() == 0){
        return true;
    }else{
        return false;
    }
}
//Operasi enqueue
void enqueueLinkedList(string nama,int umur){
    if(isFullLinkedList()){
        cout << "Antrian Penuh!" << "\n";
    }else{
        if(isEmptyLinkedList()){
            head = new antrianTokoGame();
            head->nama = nama;
            head->umur = umur;
            head->next = NULL;
            tail = head;
    }else{
        newNode = new antrianTokoGame();
        newNode->nama = nama;
        newNode->umur = umur;
        newNode->next = NULL;
        tail->next = newNode;
        tail = newNode;
     }

  }
}
//Operasi dequeue
void dequeueLinkedList(){
    if(isEmptyLinkedList()){
        cout << "Data Antrian Kosong!" << "\n";
    }else{
        del = head;
        head = head->next;
        del->next = NULL;
        delete del;
    }
}
//Operasi destory
void clearLinkedList(){
    if(isEmptyLinkedList()){
        cout << "Data Antrian Kosong!" << "\n";
    }else{
        cur =head;
        while( cur != NULL ){
            del = cur;
            cur = cur->next;
            del->next = NULL;
            delete del;
        }
        head = NULL;
        tail = NULL;
    }
}

//Operasi display

void displayLinkedList()
{
    cout << "Data Antrian : " <<endl;
    if(isEmptyLinkedList()){
        cout << "Data Antrian Kosong!!" <<endl;
    }else{
        cout <<"Banyak data antrian : " << countLinkedList() <<endl;
        cur = head;
        int nomor = 1;
        while(nomor <= maksimalAntrianTokoGame ){

            if( cur != NULL){
                cout << nomor << ". " << cur ->nama << " - " <<cur->umur << " tahun." <<endl;
                cur = cur->next;
            }else{
                cout << nomor << ". " << "(kosong)" <<endl;
            }
            nomor++;
        }
    }
    cout << "\n" <<endl;
}

int main(){
    //Menambahkan queue
    enqueueLinkedList("Azriel", 20);
    enqueueLinkedList("Fauzan", 20);
    enqueueLinkedList("Oky", 20);
    enqueueLinkedList("Huda", 20);
    enqueueLinkedList("Adi", 20);
    //Menampilkan queue
    displayLinkedList();

    //menghapus elemen pertama queue
    dequeueLinkedList();
    displayLinkedList();

    //menghapus queue secara keseluruhan
    clearLinkedList();
    displayLinkedList();

}
