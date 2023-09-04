package main
import "fmt"
func main(){
	var (
	 n int
	 status [10] string
	 nama [10] string
	 nilai [10] int
	)
	fmt.Print("Masukan Jumlah Data = ")
	fmt.Scan(&n)
	fmt.Println (" ")
	
	for i := 0; i < n; i++ {
		
		fmt.Println("Data ke- ", i)
		fmt.Print("Masukan Nama = ")
		fmt.Scan(&nama[i])
		fmt.Print("Masukan Nilai = ")
		fmt.Scan(&nilai[i])
		fmt.Println (" ")
		
		if nilai[i] <= 50 {
				status[i]=("Tidak Lulus")
		} else {
				status[i]=("Lulus")	
		}
	}
	
	fmt.Println("DAFTAR NILAI MAHASISWA")
	fmt.Println("---------------------------------------------------------------------------")
	fmt.Println("No		Nama			 Nilai		  Status			")
	fmt.Println("---------------------------------------------------------------------------")
	
	for i := 0; i < n; i++{
	fmt.Println(i,"		",nama[i],"		 ",nilai[i]," 		",status[i])
	fmt.Println("---------------------------------------------------------------------------")
	} /* */

}