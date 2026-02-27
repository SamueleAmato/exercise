#include <stdio.h>
#include <stdlib.h>

int main() {
  // An array is just a pointer whith fancy syntax
  
  int* arr = malloc(sizeof(*arr) * 10); // int arr[10];

  for (int x = 0; x < 10; x++) {
    *(arr + x) = 0;
  }

  for (int x = 0; x < 10; x++) {
    printf("%d\n", *(arr + x));
  }

  // We can also create multi dimensional array using the pointer syntax
  
  int** b_arr = malloc(sizeof(*b_arr) * 10);
  for (int x = 0; x < 10; x++) {
    *(b_arr + x) = malloc(sizeof(**b_arr) * 10);
  }

  for (int x = 0; x < 10; x++) {
    for (int y = 0; y < 10; y++) {
      // Getting the array at the position y
      int* row = *(b_arr + y); 
      // Getting the element at the position x of the array at the position y;
      int* element = row + x; 
      *element = 0;
    }
  }

  for (int x = 0; x < 10; x++) {
    for (int y = 0; y < 10; y++) {
      printf("%d ", b_arr[x][y]);
    }
    printf("\n");
  }

  return 0;
}
