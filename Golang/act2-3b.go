package main
import "fmt"
type Note struct{
	nama string
	kelas string
	praktek string
	umur int
	
}
func main(){
	nt1:= Note{
		nama: "SHAFA ZHAFIRA GUNVANY",
		kelas: "2IA28",
		praktek: "AP3B",
		umur:	20,
	}
	fmt.Println("Nama	: ", nt1.nama)
	fmt.Println("Kelas	: ", nt1.kelas)
	fmt.Println("Praktek	: ", nt1.praktek)
	fmt.Println("Umur	: ", nt1.umur)
	nt1.umur = 19
	fmt.Println("Umur	: ", nt1.umur)
}