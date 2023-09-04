package main

import "fmt"

func main() {
	var a,b,c,x,y,z int
	a = 50
	b = 20
	c = 30
	x = a + b - c
	y = a *b
	z = a / b

	fmt.Println("Nilai x = ", x)
	fmt.Println("Nilai y = ", y)
	fmt.Println("Nilai z = ", z)
}