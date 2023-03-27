#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid;

    // Create a new process
    pid = fork();

    // Check if fork() succeeded
    if (pid < 0) {
        fprintf(stderr, "Fork failed");
        return 1;
    }

    // Check if this is the parent process
    if (pid > 0) {
        printf("This is the parent process (PID=%d)\n", getpid());
    }

    // Check if this is the child process
    if (pid == 0) {
        printf("This is the child process (PID=%d)\n", getpid());
    }

    return 0;
}
