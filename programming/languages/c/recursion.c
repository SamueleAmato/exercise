#include <stdio.h>

int factorial(int n) {
  if (n == 0 || n == 1) {
    return n;
  } else {
    return factorial(n - 1) * n;
  }
}

int main(void) {
  int n = 14;
  printf("Factorial %d: %d", n, factorial(n));
}
