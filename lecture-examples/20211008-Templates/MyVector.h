#include <iostream>
#include <stdio.h>
using namespace std;

#ifndef MY_VECTOR  // Name guard to avoid importing the header file twice. Can also use `#pragma once` with modern
                   // compilers
#define MY_VECTOR

template <class T> class MyVector; //Pre-declare class for friend pre-declaration
template <class T> ostream& operator<<(ostream &, const MyVector<T> &); 
//Pre-declare global friend operator so that compile knows this is also a template function!
//Alternatives: Implement in class declaration directly OR use different generic class symbol.

template <class T>
class MyVector{
    private:
        int size; 
        T *array; 
        void boundsCheck(int);
        void arrayInitCheck();
    public: 
        MyVector();
        MyVector(int);  //Parametrized constructor
        MyVector(T *, int);  //Parameterized Constructor
        MyVector(MyVector &);  // Copy Constructor
        ~MyVector();  // dtor
        void assign(T *, int); //Assign data to array
        T& at(int);  // Get element at int
        T& front();  // Get first element
        T& back();  // Get last element
        void put(int, T);  // Put value at index 
        T & operator[](int) const;  // Index access operator
        // template <class G>  // Watch out for shadowing class generic type! Use different type symbol for friend!
        friend ostream& operator<< <> (ostream &, const MyVector<T> &);
};

template <class T>
MyVector<T>::MyVector(): size(0){};

template <class T>
MyVector<T>::MyVector(int i): size(i) {
    array = new T[size];
    assert(array != NULL);
}  
template<class T>
MyVector<T>::MyVector(T *arrayIn, int sizeIn): size(sizeIn){  //Parameterized Constructor
    array = new T[sizeIn];
    assert(array!=NULL);
    for (int i = 0; i<size; i++){
        array[i] = arrayIn[i];
    }
}
template<class T>
ostream& operator<<(ostream &os, const MyVector<T> &myVec){
    os << "[";
    int i = 0;
    while(i<myVec.size-1){
        os << myVec[i] << ", ";
        i++;
    }
    os << myVec[i] << "]\n";
    return os;
}

template<class T>
T& MyVector<T>::operator[](int i) const{  // Member access operators
    return this->array[i];
}

template <class T>
MyVector<T>::MyVector(MyVector<T> &other){ // Copy Constructor
    size = other.size;
    array = new T[size];
    assert(array != NULL);
    for (int i = 0; i<size; i++){
        array[i] = other.array[i];
    }
}
template <class T>
MyVector<T>::~MyVector(){  // dtor
    delete [] array;
}

template <class T>
void MyVector<T>::assign(T *arrayIn, int sizeIn){ //Assign data to array
    if (array != NULL){
        delete [] array;
    }
    size = sizeIn;
    array = new T[size];
    assert(array != NULL);
    for (int i = 0; i<size; i++){
        array[i] = arrayIn[i];
    }
}

template <class T>
T& MyVector<T>::at(int i){  // Get element at int
    arrayInitCheck();
    boundsCheck(i);
    return this->array[i-1];
}

template <class T>
T& MyVector<T>::front(){  // Get first element
    arrayInitCheck();
    return this->array[0];
}

template <class T>
T& MyVector<T>::back(){  // Get last element
    arrayInitCheck();
    return array[size-1];
}

template <class T>
void MyVector<T>::put(int index, T elementIn){  // Put value at index 
    arrayInitCheck();
    boundsCheck(index);
    array[index] = elementIn;
} 

template <class T>
void MyVector<T>::boundsCheck(int index){
    if (size < index || index < 0){
        cerr << "Out of bounds error! Goodbye!\n";
        exit(1);
    }
}

template <class T>
void MyVector<T>::arrayInitCheck(){
    if (array == NULL){
        cerr << "Nothing stored in this array! Goodbye!" << endl;
        exit(1);
    }
}

#endif