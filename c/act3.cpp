#include <iostream>
#include <string>
using namespace std;

struct Mahasiswa {

    //member
    string nama, alamatTinggal, email;
    int tahunMasuk;

    Mahasiswa *next;
};

int main(){
    //inisialisasi
    Mahasiswa *node1, *node2, *node3;

    node1 = new Mahasiswa();
    node2 = new Mahasiswa();
    node3 = new Mahasiswa();

    //pengisian node 1
    node1->nama = "Shafa Zhafira Gunvany";
    node1->alamatTinggal = "Jl Serdang Asri 2 Panongan";
    node1->email = "shafazhafira.g@gmail.com";
    node1->tahunMasuk = 2021;
    node1->next = node2;

    //pengisian node 2
    node2->nama = "Zhafira Gunvany";
    node2->alamatTinggal = "Citra Raya";
    node2->email = "shafa.g@gmail.com";
    node2->tahunMasuk = 2020;
    node2->next = node3;

    //pengisian node 3
    node3->nama = "Gunvany Zhafira ";
    node3->alamatTinggal = "Tigaaraksa";
    node3->email = "zhafira.g@gmail.com";
    node3->tahunMasuk = 2022;
    node3->next = NULL;

    Mahasiswa *cur;
    cur = node1;

    while(cur!=NULL){
        cout << "Nama Mahasiswa : " << cur->nama << "\n";
        cout << "Alamat Tinggal : " << cur->alamatTinggal << "\n";
        cout << "Email : " << cur->email << "\n";
        cout << "Tahun Masuk : " << cur->tahunMasuk << "\n" << "\n";

        cur = cur->next;
    }
}

