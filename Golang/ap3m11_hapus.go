package main
import "fmt"
import "os"

//path untuk alokasi file
var path ="/go/new folder/teks.txt"

func isError(err error) bool {
	if err != nil{
		fmt.Println(err.Error())
	}
	return (err != nil)
}

func deleteFile(){
	var err = os.Remove(path)
	if isError(err) { return }

	fmt.Println("==> file berhasil dihapus")
}

func main () {
	deleteFile()
}