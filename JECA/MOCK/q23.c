#include <stdio.h>

struct Node {
    int data;
    struct Node* next;
};

void fun(struct Node* start) {
    if (start == NULL)
        return;
    if (start->next != NULL)
        printf("%d ", start->data);
    fun(start->next->next);
}

int main() {
    // Create the linked list
    struct Node* head = NULL;
    struct Node* second = NULL;
    struct Node* third = NULL;
    struct Node* fourth = NULL;
    struct Node* fifth = NULL;
    struct Node* sixth = NULL;
    struct Node* seventh = NULL;

    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));
    fourth = (struct Node*)malloc(sizeof(struct Node));
    fifth = (struct Node*)malloc(sizeof(struct Node));
    sixth = (struct Node*)malloc(sizeof(struct Node));
    seventh = (struct Node*)malloc(sizeof(struct Node));

    head->data = 7;
    head->next = second;

    second->data = 6;
    second->next = third;

    third->data = 5;
    third->next = fourth;

    fourth->data = 4;
    fourth->next = fifth;

    fifth->data = 13;
    fifth->next = sixth;

    sixth->data = 14;
    sixth->next = seventh;

    seventh->data = 16;
    seventh->next = NULL;

    // Call the function to print the values
    fun(head);

    return 0;
}
