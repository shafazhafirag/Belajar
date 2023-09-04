package main

import "database/sql"
import "fmt"
import	_"github.com/go-sql-driver/mysql"


type student struct {
	npm  int
	nama string
	kelas   string
	jurusan  string
}

// koneksi database
func connect() (*sql.DB, error) {
	db, err := sql.Open("mysql", "root:@(127.0.0.1:3306)/mhs02")
	if err != nil {
		return nil, err
	}
	return db, nil
}

// pembacaan data dari server database
func sqlQuery() {
	db, err := connect()
	if err != nil {
		fmt.Println(err.Error())
		return
	}
	defer db.Close()

	rows, err := db.Query("select * from tbl_la")
	if err != nil {
		fmt.Println(err.Error())
		return
	}
	defer rows.Close()
	var result []student
	for rows.Next() {
		var each = student{}
		var err = rows.Scan(&each.npm, &each.nama, &each.kelas, &each.jurusan)

		if err != nil {
			fmt.Println(err.Error())
			return
		}
		result = append(result, each)
	}
	if err = rows.Err(); err != nil {
		fmt.Println(err.Error())
		return
	}

	for _, each := range result {
		fmt.Println(each)
	}
}
func main() {
	sqlQuery()
}
