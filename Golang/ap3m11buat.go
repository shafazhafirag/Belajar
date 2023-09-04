package main
import "fmt"
import "os"

//path untuk alamat file
var path ="/go/new folder/teks.txt>"

func isError(err error) bool {
	if err != nil{
		fmt.Println(err.Error())
	}
	return (err != nil)
}

func createFile() {
	// deteksi apakah file sudah ada
	var _, err = os.Stat(path)

	//buat dile baru jika belum ada
	if os.IsNotExist(err){
		var file, err = os.Create(path)
	if isError(err) { return }
		defer file.Close()
	}
	fmt.Println("==> file berhasil dibuat",path)
}

func main(){
	createFile()
}