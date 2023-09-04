package main
import "fmt"
func main(){
	var (
	 nilai  int
	)

	fmt.Print("Input Nilai Anda (1-10)= ")
	fmt.Scan(&nilai)


	if nilai == 10{
		fmt.Println("Lulus dengan sempurna Nilai anda ",nilai)
	} else if nilai == 5{
		fmt.Println("Lulus Nilai anda ",nilai)
	} else if nilai == 4{
		fmt.Println("Hampir Lulus Nilai anda ",nilai)
	} else {
		fmt.Println("Tidak Lulus Nilai anda ",nilai)
	}
}