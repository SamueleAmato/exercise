#include <stdio.h>

int factorial(int n, int c) {
  if (n == 0 || n == 1) {
    return c;
  } else {
    return factorial(n - 1, n*c);
  }
}

int main() {
  int n = 4;
  printf("factorial %d: %d", n, factorial(n, 1));
}
