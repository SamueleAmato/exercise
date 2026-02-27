#include <stdio.h>
#include <stdlib.h>


int main(void) {

  // Create a pointer
  int* p = malloc(sizeof(*p));

  // Checking if allocation encauntered errors
  if (!p) {
    return -1;
  }

  // Memorizing a number inside of the memory where the pointer point to
  *p = 10;

  printf("Address of p: %p\nValue contained at the address %p: %d\n", p, p, *p);

  printf("\nFreeing p...\n");

  free(p);

  printf("\nValue contained at the address %p after freeing p: %d\n", p, *p);

  return 0;
}
