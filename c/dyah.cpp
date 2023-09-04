#include <iostream>
#include <iomanip>
using namespace std;

int main () 
{
    int temp, j, NumList[8] = {5, 34, 32, 25, 75, 42, 22, 2};

    cout<<"Data Sebelum Diurutkan :";
    for(int i=0; i<8; i++)
    {
        cout<<setw(5)<<NumList[i];
    }
    cout<<endl<<endl;

    //proses pengurutan data
      for(int i=1; i<8; i++)
      {
            temp = NumList[i];
            j = i - 1;
            while(NumList[j]>temp && j>=0)
            {
                  NumList[j+1] = NumList[j];
                  j--;
            }
            NumList[j+1] = temp;
      }

    cout<<"Data setelah diurutkan :";

    for(int i=0; i<8; i++)
    {
        cout<<setw(5)<<NumList[i];
    }
    cout<<endl<<endl;
}