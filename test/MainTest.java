import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();

        switch(task) {

            case 1: {
                int n = sc.nextInt();
                System.out.println(n % 2 == 0 ? "Even" : "Odd");
                break;
            }

            case 2: {
                int a = sc.nextInt(), b = sc.nextInt();
                if (a == b) System.out.println("Equal");
                else System.out.println(Math.max(a, b));
                break;
            }

            case 3: {
                int n = sc.nextInt();
                int sum = n * (n + 1) / 2;
                System.out.println(sum);
                break;
            }

            case 4: {
                int n = sc.nextInt();
                long f = 1;
                for (int i = 1; i <= n; i++) f *= i;
                System.out.println(f);
                break;
            }

            case 5: {
                int n = sc.nextInt(), sum = 0;
                while (n != 0) {
                    sum += n % 10;
                    n /= 10;
                }
                System.out.println(sum);
                break;
            }

            case 6: {
                int n = sc.nextInt();
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    max = Math.max(max, sc.nextInt());
                }
                System.out.println(max);
                break;
            }

            case 7: {
                int n = sc.nextInt(), count = 0;
                for (int i = 0; i < n; i++) {
                    if (sc.nextInt() % 2 == 0) count++;
                }
                System.out.println(count);
                break;
            }

            case 8: {
                sc.nextLine();
                String s = sc.nextLine();
                System.out.println(new StringBuilder(s).reverse());
                break;
            }

            case 9: {
                sc.nextLine();
                String s = sc.nextLine();
                String rev = new StringBuilder(s).reverse().toString();
                System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
                break;
            }

            case 10: {
                int a = sc.nextInt(), b = sc.nextInt();
                while (b != 0) {
                    int t = b;
                    b = a % b;
                    a = t;
                }
                System.out.println(a);
                break;
            }

            case 11: {
                int n = sc.nextInt();
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    min = Math.min(min, sc.nextInt());
                }
                System.out.println(min);
                break;
            }

            case 12: {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
                break;
            }

            case 13: {
                sc.nextLine();
                String s = sc.nextLine().toLowerCase();
                int count = 0;
                for (char c : s.toCharArray()) {
                    if ("aeiou".indexOf(c) != -1) count++;
                }
                System.out.println(count);
                break;
            }

            case 14: {
                int n = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.print(n * i + " ");
                }
                break;
            }

            case 15: {
                int n = sc.nextInt(), rev = 0;
                while (n != 0) {
                    rev = rev * 10 + n % 10;
                    n /= 10;
                }
                System.out.println(rev);
                break;
            }

            case 16: {
                int n = sc.nextInt();
                double sum = 0;
                for (int i = 0; i < n; i++) sum += sc.nextInt();
                System.out.println(sum / n);
                break;
            }

            case 17: {
                sc.nextLine();
                String s = sc.nextLine();
                int count = 0;
                for (char c : s.toCharArray()) {
                    if (c == ' ') count++;
                }
                System.out.println(count);
                break;
            }

            case 18: {
                int n = sc.nextInt(), count = 0;
                for (int i = 0; i < n; i++) {
                    if (sc.nextInt() < 0) count++;
                }
                System.out.println(count);
                break;
            }

            case 19: {
                sc.nextLine();
                String a = sc.nextLine();
                String b = sc.nextLine();
                System.out.println(a + b);
                break;
            }

            case 20: {
                int n = sc.nextInt(), sum = 0;
                for (int i = 0; i < n; i++) sum += sc.nextInt();
                System.out.println(sum);
                break;
            }

            case 21: {
                int n = sc.nextInt(), count = 0;
                for (int i = 0; i < n; i++) {
                    if (sc.nextInt() % 2 != 0) count++;
                }
                System.out.println(count);
                break;
            }

            case 22: {
                int n = sc.nextInt();
                System.out.println(String.valueOf(Math.abs(n)).length());
                break;
            }

            case 23: {
                sc.nextLine();
                String s = sc.nextLine();
                System.out.println(s.toUpperCase());
                break;
            }

            case 24: {
                int a = sc.nextInt(), b = sc.nextInt();
                System.out.println(a - b);
                break;
            }

            case 25: {
                int n = sc.nextInt(), count = 0;
                for (int i = 0; i < n; i++) {
                    if (sc.nextInt() == 0) count++;
                }
                System.out.println(count);
                break;
            }

            case 26: {
                sc.nextLine();
                String s = sc.nextLine();
                System.out.println(s.length());
                break;
            }

            case 27: {
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print(sc.nextInt() * 2 + " ");
                }
                break;
            }

            case 28: {
                int a = sc.nextInt(), b = sc.nextInt();
                System.out.println(a + b);
                break;
            }

            case 29: {
                sc.nextLine();
                String s = sc.nextLine();
                char c = sc.nextLine().charAt(0);
                System.out.println(s.indexOf(c) != -1 ? "Found" : "Not Found");
                break;
            }

            case 30: {
                int n = sc.nextInt();
                Set<Integer> set = new HashSet<>();
                boolean dup = false;
                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    if (set.contains(x)) dup = true;
                    set.add(x);
                }
                System.out.println(dup ? "Duplicates found" : "No duplicates");
                break;
            }
        }
    }
}