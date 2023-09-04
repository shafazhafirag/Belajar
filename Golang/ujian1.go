package main

import "encoding/json"
import "fmt"

func main() {

    var data_mahasiswa = []labti{
        {
            Nama:   "SHAFA ZHAFIRA GUNVANY",
            Hobi: "Memasak",
        },
    }
    result, err := json.Marshal(data_mahasiswa)
    if err != nil {
        fmt.Println(err.Error())
        return
    }
    var jsonString = string(result)
    fmt.Println(jsonString)
}
type labti struct {
    Nama   string `json:"nama"`
    Hobi string `json:"Hobi"`
}