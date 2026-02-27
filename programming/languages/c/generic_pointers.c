#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int swap(void* x, void* y, int size) {
  void* tmp = malloc(size);
  if (!tmp) {
    return -1;
  }
  memcpy(tmp, x, size);
  memcpy(x, y, size);
  memcpy(y, tmp, size);
  return 1;
}

int main(void) {
  int x = 0;
  int y = 20;

  swap((void*)&x, (void*)&y, sizeof(int));

  printf("%d %d", x, y);
}
