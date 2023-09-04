package main
import "fmt"
func main(){
	var (
	 n int
	 nama  string
	 nilai  int
	)
	fmt.Print("Masukan Jumlah Data = ")
	fmt.Scan(&n)
	fmt.Println("\n")

	for i := 0; i <= n; i++ {
		
		fmt.Println("Data ke- ", i)
		fmt.Print("Masukan Nama = ")
		fmt.Scan(&nama)
		fmt.Print("Masukan Nilai = ")
		fmt.Scan(&nilai)
		
		if nilai <= 50 {
				fmt.Println("Tidak Lulus")
		} else {
				fmt.Println("Lulus")	
		}
	}
}