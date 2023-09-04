#include <iostream>
using namespace std;

struct dataBuku
{
    //Deklarasi Member
    string namaBuku;
    int hargaBuku;

    //Pointer
    dataBuku *prev;
    dataBuku *next;
};

dataBuku *head, *tail, *cur, *newNode, *del;
int maksimalBuku = 5;

//Create Stack
void createBuku(string namaBuku, int hargaBuku)
{
    head = new dataBuku();
    head->namaBuku = namaBuku;
    head->hargaBuku = hargaBuku;
    head->prev = NULL;
    head->next = NULL;
    tail = head;
}

//Operasi count
int countBuku()
{
    if (head == NULL)
    {
        return 0;
    }
    else
    {
        int banyak = 0;
        cur = head;
        while (cur != NULL)
        {
            cur = cur->next;
            banyak++;
        }
        return banyak;
    }
}
//Operasi push
void pushBuku(string namaBuku, int hargaBuku)
{
    if (countBuku() == maksimalBuku)
    {
        cout << "Data Di Stack Penuh"
             << "\n";
    }
    else
    {
        if (countBuku() == 0)
        {
            createBuku(namaBuku, hargaBuku);
        }
        else
        {
            newNode = new dataBuku();
            newNode->namaBuku = namaBuku;
            newNode->hargaBuku = hargaBuku;
            newNode->prev = tail;
            tail->next = newNode;
            newNode->next = NULL;
            tail = newNode;
        }
    }
}
//Operasi Display
void displayBuku()
{
    if (head == NULL)
    {
        cout << "Stack Kosong"
             << "\n";
    }
    else
    {
        cout << "Data Buku : "
             << "\n";
        cur = tail;
        while (cur != NULL)
        {
            cout << "Data Buku : " << cur->namaBuku << " - Rp." << cur->hargaBuku << "\n";
            cur = cur->prev;
        }
        cout << "\n";
    }
}
//Operasi pop
void popBuku()
{
    del = tail;
    tail = tail->prev;
    tail->next = NULL;
    delete del;
}

//Operasi isEmpty
bool isEmpty()
{
    if (countBuku() == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
//Operasi isfull
bool isFull(){
    if (countBuku() == maksimalBuku)
    {
        return true;
    }
    else
    {
        false;
    }
}
//Operasi Peek
void peekBuku(int posisi)
{
    if (isEmpty())
    {
        cout << "Data Buku Kosong"
             << "\n";
    }
    else
    {
        int nomor = 1;
        cur = tail;
        while (nomor < posisi)
        {
            cur = cur->prev;
            nomor++;
        }
        cout << "Data Buku posisi ke - " << posisi << " : " << cur->namaBuku << "- Rp." << cur->hargaBuku << "\n";
    }
}

//Operasi Change
void changeBuku(string namaBuku, int hargaBuku, int posisi)
{
    if (isEmpty())
    {
        cout << "Data Buku Kosong"
             << "\n";
    }
    else
    {
        int nomor = 1;
        cur = tail;
        while (nomor < posisi)
        {
            cur = cur->prev;
            nomor++;
        }
        cur->namaBuku = namaBuku;
        cur->hargaBuku = hargaBuku;
    }
}
//Operasi Destroy
void destroyBuku()
{
    cur = head;
    while (cur != NULL)
    {
        del = cur;
        head = head->next;
        delete del;
        cur = cur->next;
    }
}

int main()
{
    //Operator Push
    pushBuku("Matematika", 30000);
    pushBuku("IPA", 40000);
    pushBuku("Penjaskes", 40000);
    pushBuku("Sejarah", 40000);
    pushBuku("Pemograman Java", 40000);
    // Operator Display
    displayBuku();

    //Operator Peek
    peekBuku(3);

    //Operator Change
    changeBuku("Seni Budaya", 30000, 5);
    displayBuku();

    //Operator Pop
    popBuku();

    //Operator isFull
    cout << "Apakah Stack penuh? : " << isFull() << "\n";
    // Operator isEmpty
    cout << "Apakah Stack tidak ada isinya? : " << isEmpty() << "\n";
    //Operasi count
    cout << "Jumlah Buku : " << countBuku() << "\n";

    //Operator Destroy
    destroyBuku();

    cout << "Apakah Stack penuh? : " << isFull() << "\n";
    cout << "Apakah Stack tidak ada isinya? : " << isEmpty() << "\n";
}
