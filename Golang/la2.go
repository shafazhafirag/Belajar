package main
import "fmt"
func main(){
	var (
	 nilai  string
	)

	fmt.Print("Input Nilai Anda(A - E) = ")
	fmt.Scan(&nilai)


	if nilai == ("A"){
		fmt.Println("Pertahankan!")
	} else if nilai == ("B"){
		fmt.Println("Harus Lebih Baik Lagi")
	} else if nilai == ("C"){
		fmt.Println("Perbayak Belajar")
	} else if nilai == ("D"){
		fmt.Println("Jangan Keseringan Main")
	} else if nilai == ("E"){
		fmt.Println("Kebanyakan Bolosssss..........")
	} else {
		fmt.Println("Maaf, Format Nilai Tidak Sesuai")
	}
}