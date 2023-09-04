package main 

import "fmt"

func main(){
	var nilai int
	nilai = 90

	switch nilai {
	case 100:
		fmt.Println("Excellent")
		break
	case 90:
		fmt.Println("Good")
		break
	case 80:
		fmt.Println("Better")
		break
	default:
		fmt.Println("Sorry You Faill")
	}
}