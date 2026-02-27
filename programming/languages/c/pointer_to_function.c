#include <stdio.h>

typedef struct {
  // Implementation
} person;

int match_int (void* x, void* y) {
  return *((int*)x) == *((int*)y);
}

int match_person(void* x, void* y) {
  // Implementation
}

int main(void) {
  int (*match)(void* x, void* y);

  match = match_int;

  int x = 0;
  int y = 0;
    
  printf("%d", match((void*)&x, (void*)&y));
}

// When yu create an object person, you can set his match function to the "match_person"one, with this technique you can implement methods in c
