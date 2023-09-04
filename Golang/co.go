package main

import (
	"fmt"
)

func main() {
	var nama, mataKuliah string
	var nilai, nim int
	fmt.Println("Masukkan NIM Anda : ")
	fmt.Scan(&nim)
	fmt.Println("Masukkan Nama Anda: ")
	fmt.Scan(&nama)
	fmt.Println("Masukkan Mata Kuliah Anda: ")
	fmt.Scan(&mataKuliah)
	fmt.Println("Masukkan Nilai Anda: ")
	fmt.Scan(&nilai)

	fmt.Printf("Nama(NIM) => %s %d \n", nama, nim)
	fmt.Printf("Matkul(Nilai) => %s %d \n", mataKuliah, nilai)
}