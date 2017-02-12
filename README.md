# Sorting Algorithms
Алгоритми сортування:
  * Сортування вибором(Selection Sort) - простий алгоритм сортування лінійного масиву, на основі вставок.
  * Сортування злиттям(Merge Sort) - алгоритм сортування, в основі якого лежить принцип «Розділяй та володарюй».  
  * Швидке сортування(Quick Sort) - алгоритм сортування, добре відомий, як алгоритм розроблений Чарльзом Гоаром, який не потребує додаткової пам'яті і виконує у середньому O(n log n) операцій.
  * Сортування вставками(Insertion Sort) - простий алгоритм сортування на основі порівнянь. На великих масивах є значно менш ефективним за такі алгоритми, як швидке сортування, пірамідальне сортування та сортування злиттям. 
  * Сортування бульбашкою(Bubble Sort) - навчальний алгоритм.
  
### Merge Sort

####Рекурсивний алгоритм:
```java
private void sortMerge(int lowIndex, int highIndex){
        if(lowIndex<highIndex){
            int middle = lowIndex +(highIndex - lowIndex)/2;
            sortMerge(lowIndex, middle);
            sortMerge(middle+1, highIndex);
            merge(lowIndex, middle, highIndex);
        }
    }
```
####Ітеративний алгоритм:

При ітеративному алгоритмі використовується на O(log n) менше памяті, яка раніше витрачалася на рекурсивні визови.

### Bubble Sort

Алгоритм працює таким чином — у поданому наборі даних порівнюються два сусідні елементи. Якщо один з елементів, не відповідає критерію сортування (є більшим, або ж, навпаки, меншим за свого сусіда), то ці два елементи міняються місцями. Прохід по списку продовжується до тих пір, доки дані не будуть відсортованими.

```java
for(int i  =  number.length - 1; i >= 0; i--){
            for(int j = 0; j<i; j++){
                if(number[j] >= number[j+1]){
                    int temp =  number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
```

### Gnome Sort

Алгоритм сортування, схожий на сортування вставками, але на відміну від останнього, перед вставкою на потрібне місце відбувається серія обмінів, як в сортуванні бульбашкою.

```java
while (i<numbers.length){
            if(i==0||numbers[i-1] <= numbers[i]){
                i++;
            }else{
                int temp = numbers[i];
                numbers[i] = numbers[i-1];
                numbers[i-1] = temp;
                i--;
            }
        }
```

### Quick Sort

Швидке сортування — алгоритм сортування, добре відомий, як алгоритм розроблений Чарльзом Гоаром, який не потребує додаткової пам'яті і виконує у середньому O(nlogn) операцій. Однак, у найгіршому випадку робить O(n^2)  порівнянь.
Швидке сортування є алгоритмом на основі порівнянь, і не є стабільним.

```java
int middle= lowInndex+(highInde-lowInndex)/2;
        int i = lowInndex;
        int j =  highInde;
        while (i<j){
            while (i<middle&&(number[i]<=number[middle])){
                i++;
            }
            while (middle<j&&(number[middle]<=number[j])){
                j--;
            }
            if(i<j){
                int temp = number[i];
                number[i] = number[j];
                number[j] = temp;

                if(i==middle){
                    middle = j;
                }else if(j==middle){
                    middle = i;
                }
            }
        }
        quickSort(lowInndex, middle);
        quickSort(middle+1, highInde);
```

### Shell Sort

Сортування Шелла - удосконалена версія сортування вставками. Ідея полягає в порівнянні елементів, які знаходяться не тільки рядом але й на певній відстані один від одного.

```java
for (int i = number.length/2; i>0; i /= 2){
            for (int j = i;j<number.length; j++ ){
                int temp =  number[j];
                int k;
                for (k = j; k>=i; k-=i){
                    if(temp<number[k-i])
                        number[k] = number[k-i];
                    else
                        break;
                }
                number[k] = temp;
            }
        }
```

### Selection Sort

Кроки алгоритму:

* Знаходимо номер мінімального значення в списку.
* Здійснюємо обмін цього значення із значення першої невідсортованої позиції
* Тепер сортуємо хвіст списку, виключив з розгляду вже відсортовані елементи.

```java
 for (int i =  0; i<number.length; i++){
            int index =  i;
            for (int j = i+1; j<number.length; j++){
                if(number[j]<number[index]){
                    index = j;
                }
            }
            int temp = number[i];
            number[i] = number[index];
            number[index] = temp;
        }
```

### Insertion Sort

Алгоритм сортування, в якому елементи вхідної послідовності переглядаються по одному і кожен новий поступивший елемент в підхлдяще місце рініш упорядкованих елементів

```java
for (int i = 1; i<number.length; i++){
            int temp = number[i];
            int j = i-1;
            while (j>=0 && number[j]>temp){
                number[j+1] = number[j];
                j=j-1;
            }
            number[j+1] = temp;
        }
```
