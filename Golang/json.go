package main

import "fmt"
import "encoding/json"
import "net/http"

func main(){
	http.HandleFunc("/api/mahasiswa", user)
	fmt.Println("web berjalan dengan port 8085")
	http.ListenAndServe(":8085", nil)
}

type labti struct {
	Nama string `json:"nama_mahasiswa"`
	Kursus string `json:"kursus_mahasiswa"`

}

var data_mahasiswa = []labti{
	{
		Nama:   "SHAFA ZHAFIRA GUNVANY",
        Kursus: "LABTI AP3B",
	},
	{
		Nama: "FIRA HAFA VANY",
		Kursus: "JSON GOLANG",
	},
}

func user(w http.ResponseWriter, r *http.Request){
	w.Header().Set("Content-type", "application/json")

	if r.Methode == http.MethodGet {
		result, err := json.Marshal(data_mahasiswa)
		if err != nil {
			http.Error(w, err.Error(), http.StatusInternalServerError)
			return
		}
		w.write(result)
		return
	}
}