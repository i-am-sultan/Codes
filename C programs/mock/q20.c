#include <stdio.h>
struct School
{
    int age, rollNo;
    double marks;
};
void solve()
{
    struct School sc;
    sc.age = 19;
    sc.rollNo = 82;
    sc.marks = 19.04;
    printf("%d", (int)sizeof(sc));
}
int main()
{
    solve();
    return 0;
}
