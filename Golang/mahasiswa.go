package main

import "encoding/json"
import "fmt"
import "net/http"

func main() {
	http.HandleFunc("/api/mahasiswa", user)
	fmt.Println("web berjalan dengan port 8085")
	http.ListenAndServe(":8085", nil)
}

type labti struct {
	Nama   string `json:"nama_mahasiswa"`
	Kursus string `json:"kursus_mahasiswa"`
}

var data_mahasiswa = []labti{
	{
		Nama:   "Shafa Zhafira Gunvany",
		Kursus: "Funda Web",
	},
	{
		Nama:   "Hafa Fira Vany ",
		Kursus: "Funda DBMS",
	},
}

func user(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Cotent-type", "application/json")

	if r.Method == http.MethodGet {
		result, err := json.Marshal(data_mahasiswa)

		if err != nil {
			http.Error(w, err.Error(), http.StatusInternalServerError)
			return
		}

		w.Write(result)
		return
	}
}