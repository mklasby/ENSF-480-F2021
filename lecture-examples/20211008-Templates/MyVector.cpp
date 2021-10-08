#include "MyVector.h"
#include <iostream>

using namespace std;

int main(){
    int a[3]  = {0,1,2};
    MyVector<int> myVec(a, 3);
    cout << myVec << endl;
    int b[5] = {1,2,3,4,5};
    myVec.assign(b, 5);
    cout << myVec << endl;
    cout << "Element in MyVec at position 2 is " << myVec.at(2) << endl;
    cout << "Front element is: " << myVec.front() << endl;
    cout << "Back element is: " << myVec.back() << endl;   
    double c[5] = {10, 20, 30, 40, 50};
    MyVector<double> emptyVec(c, 5); 
    cout << "Testing bad bounds call: " << emptyVec.at(-1) << endl;
}