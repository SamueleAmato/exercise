#include <stdio.h>

int swap(int* x, int* y) {
  int tmp = *x;
  *x = *y;
  *y = tmp;
}

int main() {
  int a = 10;
  int b = 20;

  swap(&a, &b);

  printf("%d %d", a, b);
}
