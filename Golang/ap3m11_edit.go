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

func writeFile() {
	//buka file dengan level akses READ & WRITE
	var file, err = os.OpenFile(path, os.O_RDWR, 0644)
	if isError(err) { return }
	defer file.Close()

	// tulis data ke file
	_, err = file.WriteString("halllo\n")
	if isError(err) { return }
	_, err = file.WriteString("Mari belajar golanggg\n")
	if isError(err) { return }

	//simpan perubahan
	err = file.Sync()
	if isError(err) { return }

	fmt.Println("==> file berhasil diisi")
}

func main() {
	writeFile()
}
