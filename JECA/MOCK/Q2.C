#include <stdio.h>
void solve() {
    char ch[10] = "abcde";
    int ans = 0;
    for(int i = 0; i < 5; i++) {
        ans += (ch[i] - 'a');
    }
    printf("%d", ans);
}
int main() {
    solve();
	return 0;
}