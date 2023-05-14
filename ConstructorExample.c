#include <iostream>

using namespace std;

class Person {
  private:
    string name;
    int age;

  public:
    // Default constructor
    Person() {
        name = "";
        age = 0;
    }

    // Parameterized constructor
    Person(string n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(const Person &p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }
};

int main() {
    // Using default constructor
    Person p1;
    cout << "Person 1:" << endl;
    p1.display();

    // Using parameterized constructor
    Person p2("John", 25);
    cout << "Person 2:" << endl;
    p2.display();

    // Using copy constructor
    Person p3 = p2;
    cout << "Person 3 (Copy of Person 2):" << endl;
    p3.display();

    return 0;
}
