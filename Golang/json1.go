package main

import "fmt"
import "encoding/json"

type labti struct{
	Nama string `json:"nama_mahasiswa"`
	Kursus string `json:"kursus_mahasiswa"`
}

func main(){
	var jsonString = `[{"nama_mahasiswa" : "Shafa Zhafira Gunvany", "kursus_mahasiswa" : "AP3B"}]`
	var jsonData = []byte(jsonString)

	var data_mahasiswa []labti

	var err = json.Unmarshal(jsonData, &data_mahasiswa)
	if err != nil {
		fmt.Println(err.Error())
		return
	}
	fmt.Printf("%v", data_mahasiswa)
	fmt.Printf("%s", data_mahasiswa[0].Nama)
}