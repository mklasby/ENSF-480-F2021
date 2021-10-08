#include <iostream>
#include <stdio.h>
using namespace std;

struct Person{
    const char *firstName;
    const char *lastName;
    int age;
};

template <class T>  //typename and class are interchangeable here
T min(T &a, T&b){
    cout << "Type of T in min is: " << typeid(a).name() << endl;
    // Invoke program with command ./<programName> | c++filt --types to see unmangled type names (human readable)
    return(a<b) ? a : b; 
}

template<>
Person min<Person>(Person &a, Person &b){  // Specialization of min<T> for Person struct.
    cout << "Explict specialization of min() for " << typeid(a).name() << endl;
    // Invoke program with command ./<programName> | c++filt --types to see unmangled type names (human readable)
    if (a.age < b.age) return a;
    else return b;
}


const char * min(const char *a, const char *b){  //Overload of min()
    cout << "In specalized min call!" << endl;
    cout << "Type of T in min is: " << typeid(a).name() << endl;
    if (a<b) return a;
    else return b;
}

int main(){
    Person p1 = {"Issac", "Newton", 378};
    Person p2 = {"Leonhard", "Euler", 314};
    double x = 11; 
    double y = 12;
    const char *a = "ABC";
    const char *b = "DEF";
    char c = 'a';
    char d = 'b';
    double minDouble = min(x, y);
    printf("The smaller double is %.2f\n", minDouble);
    char minChar = min(c,d);
    printf("The smaller char is %c\n", minChar);
    const char *minString = min(a,b);
    printf("The smaller c-string is %s\n", minString);
    Person smallerP = min(p1, p2);
    printf("The younger person is %s\n", smallerP.firstName);
}