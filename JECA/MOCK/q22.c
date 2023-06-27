#include <iostream>

class Base {
public:
    int x;
    virtual void func() {
        cout << "Base class func()" << endl;
    }
};

class Derived : public Base {
public:
    int y;
    void func() {
        cout << "Derived class func()" << endl;
    }
};

int main() {
    Base* ptr = new Derived();
    ptr->x = 10;
    ptr->func();
    delete ptr;
    return 0;
}
